
package CAMBIO;
import java.util.ArrayList;
/**
 *
 * @author Miguel
 */

public class Cambio {
    private double importe;
    private ArrayList<Double> billetes = new ArrayList<Double>() {{
        add(1000.0);
        add(500.0);
        add(200.0);
        add(100.0);
        add(50.0);
        add(20.0);
        add(10.0);
        add(5.0);
        add(2.0);
        add(1.0);
        add(0.5);
        add(0.2);
        add(0.1);
        add(0.05);
        add(0.02);
        add(0.01);
    }};

    public Cambio(double importe) {
        this.importe = importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
/* como no se el importe de la compra, uso importe tanto como  como 
    cambio y como pagado.
    */
    public ArrayList<Double> obtenerCambio(double pagado) { //si tuviera los datos " a pagar y pagado"
        ArrayList<Double> cambio = new ArrayList<>();       //el pagado lo restaria al importe.
        double cambioRequerido = importe; 

        for (double billete : billetes) {
            while (cambioRequerido >= billete) {
                cambio.add(billete);
                cambioRequerido -= billete;
            }
        }

        return cambio;
    }
    public void mostrarCambio() {
        System.out.println("Importe: " + importe);
        System.out.println("cambio a devolver: " + obtenerCambio(importe));
    }
}







