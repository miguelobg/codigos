
package Ecuaciones;

/**
 *
 * @author Miguel
 */
class Ecuacion2Grado {
    private double a, b, c;

    public Ecuacion2Grado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    
    public void setB(double b){
        this.b = b;
    }

    public double[] solucion() {
        double discriminante = (b * b) - (4 * a * c);
        if (discriminante < 0) {
            System.out.println("no hay solucion");//discriminante negativo
            return new double[] {0};
        }
        double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
        return new double[] {x1, x2};
    }

    public boolean esPositivoDiscriminante() {
        double discriminante = (b * b) - (4 * a * c);
        return discriminante >= 0;
    }  
}


