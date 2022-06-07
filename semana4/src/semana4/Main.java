/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4;

import java.util.ArrayList;

/**
 *
 * @author johan_p9pyxb1
 */
class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int arreglo[] = new int[4];
        ArrayList<Book> prueba = new ArrayList<>(6);
        Book a= new Book("Hola");
        prueba.add(a);
        prueba.add(0,new Book("Prueba"));
        System.out.println(prueba);
        prueba.remove(a);
                System.out.println(prueba);
        prueba.remove(new Book("Prueba"));
        prueba.remove(0);
                System.out.println(prueba);
        // [0,0,0,0]
        // no se puede hacer más grande 
        ArrayList<Integer> numeros = new ArrayList<>();
numeros.add(0);
numeros.add(2);
numeros.add(4);
numeros.add(6);
numeros.add(8);

        arreglo[1] = 10;
        arreglo[2] = 8;
        arreglo[3] = 6;
        //[0,10,8,6]
        int arreglo2[] = {2, 4, 3};

        int matriz[][] = new int[3][2];
        matriz[0][0] = 6;
        matriz[0][1] = 8;
        matriz[1][0] = 10;
        matriz[1][1] = 12;
        matriz[2][0] = 14;

        int contador = 0;


        
//        for (int i = 0; i < arreglo.length; i++) {
////		contador++;
////	  arreglo[i]=contador+1;
//            System.out.println(arreglo[i]);
//        }
//	for(int e: arreglo){
//            System.out.println(e);
//	}
// [1,2,3,4,5]
// 1   2   3  4 5 
    

        ArrayList<String> arregloDinamico= new ArrayList<>();
        System.out.println(arregloDinamico);
        arregloDinamico.add("Juan");
        System.out.println(arregloDinamico);
         ArrayList<Camion> arregloDinamico2= new ArrayList<>();
        
    }
}
