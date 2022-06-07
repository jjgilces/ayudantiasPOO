
package sumacantidad_stephanyvillacis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author johan_p9pyxb1
 */
public class SumaCantidad_StephanyVillacis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
       
        
        FileWriter fl = new FileWriter("notas.txt");
        String user="";
        while(!user.equalsIgnoreCase("FIN")){
           
          
            int numero;
            do{
                System.out.println("Ingrese un numero entero");
                numero = sc.nextInt();
                sc.nextLine();
            }
        while(numero<0  && numero>999);
            
        BufferedWriter b1 = new BufferedWriter(fl);
        b1.write(numero);
        System.out.println("Desea salir? ");
        user= sc.nextLine();
        }
        
        System.out.println("LEYENDO EL ARCHIVO...   ");
        FileReader fl2 = new FileReader("notas.txt");
        BufferedReader bfr=new BufferedReader(fl2);
        String linea;
        while((linea=bfr.readLine())!= null){
            System.out.println(linea);
        }
    }
}
