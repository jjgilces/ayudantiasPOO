/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author johan_p9pyxb1
 */
public class Lectura {

    public static void main(String[] args) {
        //NIO (archivos pequeños)
        List<String> lines=null;
        try {
           lines = Files.readAllLines(Paths.get("Archivo.txt"));
            System.out.println("leyendo archivo");
        }
        catch (IOException e) {
            System.err.println(e);
        }
        
//        for (String line : lines) {
//            String[] datos= line.split(",");
//            String nombre= datos[0];
//            int edad= Integer.parseInt(datos[1]);
//            System.out.println(nombre);
//        }

     
        try ( BufferedReader lector = new BufferedReader(new FileReader("Archivo.txt"))) {
            String a;
            ArrayList<Persona> personas= new ArrayList<>();
            lector.readLine();
            while ((a = lector.readLine()) != null) {
                String[] datos= a.split(",");
                String nombre= datos[0];
                int edad= Integer.parseInt(datos[1]);
                Persona p= new Persona(nombre, edad);
                personas.add(p);
            }
            System.out.println(personas);

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado " + e);
        } catch (IOException e) {
            System.out.println("Error de entrada/salida" + e);
        }

        }
    public static String cargarArchivo() throws FileNotFoundException, IOException{
         BufferedReader lector = new BufferedReader(new FileReader("palabras.dat"));
         if(lector.readLine()==null){
             throw new ArchivoVacioException()
         }
    }
    
 
}   
