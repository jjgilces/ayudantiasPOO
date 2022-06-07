/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerarchivosventas;

import java.util.Scanner;

/**
 *
 * @author APELLIDOS AQUI
 */
public class TallerArchivosVentas {
     public static String[] categorias={"electrodomesticos","celulares","computadoras"};
     public static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ingresarVenta();
    }
    
    public static void ingresarVenta(){
        System.out.print("Codigo Producto: ");
        int codigo=sc.nextInt();
        sc.nextLine();
        System.out.println("Nombre Producto: ");
        System.out.println("Precio: ");
        System.out.println("Categoria: ");
        System.out.print("Cantidad: ");
        int cantidad=sc.nextInt();
        sc.nextLine();
        System.out.println("Desea ingresar otra venta? S/N ");
        String continuar=sc.nextLine();
      
        
    }
}
