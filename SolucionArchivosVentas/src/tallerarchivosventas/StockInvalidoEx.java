
package tallerarchivosventas;


public class StockInvalidoEx extends Exception {
    private String linea;

    public StockInvalidoEx(String linea) {
        super("stock Negativo"+linea);
        this.linea = linea;
    }
    
}

