/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estatico;

import static java.lang.Math.sqrt;


/**
 *
 * @author johanjairgilcesreyes
 */
public class Coordenada {

    private double latitud;
    private double longitud;

    public  static double RADIOTIERRA = 6378.137;

    public Coordenada(double latitud, double longitud) {
        
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public static double calcularDistanciaDosPuntos(Coordenada c1, Coordenada c2){
        double lat1= c1.latitud;
        double lat2= c2.latitud;
        double long1= c1.longitud;
        double long2= c2.longitud;
        double dfLat= lat2 - lat1;
        double dflong= long2 - long1;
        double suma= sqrt(dfLat)+sqrt(dflong);
        double result= Math.pow(suma,(1/2));
        return result;        
    }

    public static int multiplicacion(){
       return 10;
    }
    public double suma(){
        return latitud+ ;
    }
}
