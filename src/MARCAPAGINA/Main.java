
package MARCAPAGINA;

public class Main {

   public static void main(String[] args) {
      MarcaPagina marca;
      marca = new MarcaPagina(100);
      marca.siguientePag();
      marca.siguientePag();
      marca.siguientePag();
      System.out.println("Última página: " + marca.ultimaPaginaLeida());
      marca.comenzar();
      System.out.println("Última página: " + marca.ultimaPaginaLeida());
   }
}
