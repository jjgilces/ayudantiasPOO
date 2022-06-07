package tallerarchivosventas;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gilces Reyes
 */
public class TallerArchivosVentas {

    public static String[] categorias = {"electrodomesticos", "celulares", "computadoras"};
    public static ArrayList<Producto> productos = new ArrayList<>();
    public static ArrayList<Venta> ventas = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        deseralizar();
        for (String categoria : categorias) {
            leerArchivos(categoria);
        }
        double totalV=0;
        if (!ventas.isEmpty()) {
            for (Venta v : ventas) {
                totalV += v.getValor();
            }
        }

        boolean salir = true;
        do {
            try {
                System.out.println("Total de Ventas Acumuladas:" + totalV);
                System.out.println("=======================================================");
                System.out.println("Bienvenido al sistema");
                ingresarVenta();
                System.out.println("Desea ingresar otra venta? S/N ");
                String op = sc.nextLine();
                if (op.equalsIgnoreCase("N")) {
                    salir = false;
                } else if (op.equalsIgnoreCase("s")) {
                    salir = true;
                }

            } catch (CodigoInvalidoEx ex) {
                System.err.println(ex);
            }

        } while (salir);

    }

    public static void ingresarVenta() throws CodigoInvalidoEx {
        System.out.print("Codigo Producto: ");
        int codigo = sc.nextInt();
        sc.nextLine();
        Producto productoVenta = retornarProducto(codigo);
        Venta v = null;
        if (productoVenta != null) {
            System.out.println("Nombre Producto: " + productoVenta.getNombre());
            System.out.println("Precio: " + productoVenta.getPrecio());
            System.out.println("Categoria: " + productoVenta.getNombre());
            System.out.print("Cantidad: ");
            int cantidad = sc.nextInt();
            sc.nextLine();
            while (cantidad > productoVenta.getStock() || cantidad < 0) {
                System.out.println("No hay stock suficiente");
                System.out.print("Cantidad: ");
                cantidad = sc.nextInt();
                sc.nextLine();
            }
            double totalP = cantidad * productoVenta.getPrecio();
            System.out.println("Total a pagar:" + totalP);
            productoVenta.reducirStock(cantidad);
            v = new Venta(totalP);
            ventas.add(v);
            serializar();
        } else {
            throw new CodigoInvalidoEx();
        }
    }

    public static Producto retornarProducto(int codigo) {
        for (Producto producto : productos) {
            Producto base = new Producto(codigo);
            if (producto.equals(base))    return producto;      
        }
        return null;
    }

    public static void leerArchivos(String categoria) {
        try ( BufferedReader lector = new BufferedReader(new FileReader("src/archivos/" + categoria + ".csv"))) {
            lector.readLine();
            String linea;
            while ((linea = lector.readLine()) != null) {
                try {
                    String[] lineaStock = linea.split(";");
                    String[] lineaSep = lineaStock[0].split(",");
                    if (Double.parseDouble(lineaStock[1]) <= 0) {
                        throw new StockInvalidoEx(linea);
                    }
                    Producto p = new Producto(Integer.parseInt(lineaSep[0]), lineaSep[1], Double.parseDouble(lineaSep[2]), Double.parseDouble(lineaStock[1]), categoria);
                    productos.add(p);
                } catch (ArrayIndexOutOfBoundsException | StockInvalidoEx | NumberFormatException e) {
                    System.err.println("El archivo contiene error en la linea : " + linea + " Verificar: " + e);
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("leerArchivoProds(): Archivo no encontrado: " + e);
        } catch (IOException ex) {
            System.err.println("leerArchivoProds(): Otros errores de IO: " + ex);
        }

    }

    public static void serializar() {
        try ( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/archivos/ventas"));) {
            oos.writeObject(ventas);
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado "+ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

    public static void deseralizar() {
        try ( ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/archivos/ventas"))) {
            ventas = (ArrayList<Venta>) ois.readObject();// debe ser ya un archivo creado
            System.out.println("Proceso de deserializacion culminado con exito");
        } catch (ClassNotFoundException ex) {
            System.out.println("Clase no econtrada");
        } catch (FileNotFoundException ex) {
            System.out.println("todavia no hay archivo disponible");
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
