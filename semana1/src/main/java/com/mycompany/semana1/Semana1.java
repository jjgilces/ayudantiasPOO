/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

//scaner 
/*

import java.util.Scanner;
Scanner sc = new Scanner(System.in);  
System.out.print("Ingrese su edad:");
    // ingreso de numero entero
    int edad = sc.nextInt();
    System.out.print("Ingrese su salario:");
    double salario = sc.nextDouble();
    sc.close();

*/
package com.mycompany.semana1;
import java.util.Scanner;
/**
 *
 * @author johanjairgilcesreyes
 */
public class Semana1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int n1=45;
        short n4=157;
        float  n2=25.3f;
        double n3= 25.4;
        char c='Y';
        char c3=88;
        System.out.println(c3+" "+c);
        
        boolean d= false;//van escritos con minusculos
        char c2=79;
        
        int numero1= 45;
        
        System.out.println(++numero1);
        System.out.println(numero1);
        boolean b1= true;
        boolean b2= false;
        boolean r= b1 && b2;// short circuits
        // true and true and true or true 
        // true and false and true and true...--> false
        System.out.println("\nHola");
        System.out.println("\t\t\t escoja una opcion: ");
        /*/python
        numero=10
        if numero<5:
           print(es menor)
        elif numero>5:
            print(es mayir)
            else:
            print(igual)
             */     
        int numero20=55;
        if(numero20>10){
            System.out.println("El numero es mayor a 10");
            System.out.println("saludos");
            numero20++;
        }else if(numero20==10){
            System.out.println("El numero es igual a 10");
        }else{
            System.out.println("Menor a 10");
        }
            
        for(int i=1;i<=10;i+=2){
            System.out.println(i);
        }
        
        int num1=10; 
        switch(num1){
            case 1:
                System.out.println("El numero es uno");
                break;
            case 2:
                System.out.println("El numero es 2");
                break;
            default: 
                System.out.println("El numero no es 1 ni es 2"); 
        }
        String semaforo="Rojo";
        switch(semaforo){
            case "Rojo":
                System.out.println("DETENERSE");
                break;
            case "Amarillo":
                System.out.println("Disminuir la velocidad");
                break;
            case "Verde":
                System.out.println("Siga Adelante");           
        }
//        int n=10;
//        while(n<10){//si es falsa la condicion NUNCA ENTRA al ciclo
//            System.out.println(n);
//            n++;
//        }
        int n=10;
        do{//al menos garantiza de que se ejecuta 1 vez
            System.out.println(n);
            n++;
        }while(n<10);
        
        
      
        //Realice este ejercicio usando for, while y do-while
  

    // Scanner sc = new Scanner(System.in);  
//     System.out.print("Ingrese su edad:");
//    // ingreso de numero entero
//    int edad = sc.nextInt();
//    sc.nextLine();
//    System.out.print("Ingrese su salario:");
//    double salario = sc.nextDouble();
//    sc.nextLine();
//    System.out.print("Ingrese su nombre:");
//    String nombre= sc.nextLine();
//    
//    
//  
//      //2.	Solicitar el ingreso de 5 números enteros y calcular el promedio.  
//      int total=0;
//    for(int j=1;j<=5;j++){
//        System.out.println("Ingrese el numero "+j+" :");
//        int numeros = sc.nextInt();
//        sc.nextLine();
//        total+=numeros;
//    }
//    double promedio= total/5;
//        System.out.println(promedio);
//    
//
//    
//    int contador=0;
//    int total1=0;
//    while(contador<5){
//        System.out.println("Ingrese un numero :");
//        int numeros = sc.nextInt();
//        sc.nextLine();
//        total1+=numeros;
//        contador++;
//    }
//    double promedio2= total1/5;
//    System.out.println(promedio2); 
//    int total=0;
//    int num;
//    do{
//        System.out.println("Ingrese un numero: ");
//        num= sc.nextInt();//-8
//        if(num>0){
//            total+=num;
//        }
//    }while(num>0);
//        System.out.println(total);
//        
//        
//    System.out.println("Parcial 1: ");
//    int numA= sc.nextInt();//-8
//    sc.nextLine();
//    System.out.println("Parcial 2:");
//    int numB= sc.nextInt();
//    sc.nextLine();
//    
//    double prom= (numA+numB)/2;
//    System.out.println(prom);
//    
    
    
    /*    
    1.	Lea la cantidad de kWh que ha consumido una familia y el precio por cada kWh. 
    Si la cantidad es mayor a 700, incremente el precio en 5% para el exceso de kWh sobre 700. 
    Muestre el valor total a pagar
    */
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Ingrese la cantidad de kwh que ha consumido: ");
    int cantidad= sc.nextInt();
    sc.nextLine();
    System.out.println("Ingrese el precio de cada kwh: ");
    double precio= sc.nextDouble();
    sc.nextLine();
    int extra= cantidad-700; //  -20   0   20
 
    double total=0;
    if(extra>0){
        double nprecio= precio+ (precio*0.05);//105
        total+= (nprecio*extra);       
        cantidad=700;
    }
    
    total= cantidad*nprecio;
    
    
    System.out.println(total);
    }
    
    
    
       
    
}