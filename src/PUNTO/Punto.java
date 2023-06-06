
package PUNTO;

public class Punto {
   double x, y;

   public Punto(double x, double y) {
      this.x = x;
      this.y = y;
   }

   public void desplazaX(double dx) {
      x += dx;
   }

   public void desplazaY(double dy) {
      y += dy;
   }

   public void desplaza(double dx, double dy) {
      desplazaX(dx);
      desplazaY(dy);
   }

   public double distanciaEuclidea(Punto otro) {
      double dx = x - otro.x;
      double dy = y - otro.y;
      return Math.sqrt(dx * dx + dy * dy);
   }

   public void muestra() {
      System.out.println("(" + x + ", " + y + ")");
   }
}

