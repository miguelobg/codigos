
package COLORES;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Miguel
 */
public class Main {

   public static void main(String[] args) {
      Colores colores = new Colores();
      colores.addColor("Marrón");
      colores.addColor("Azul");
      colores.addColor("Amarillo");
      colores.addColor("Celeste");
      colores.addColor("Rosa");
      
      ArrayList<String> seleccionColores = colores.seleccionColores(3);
    System.out.println("Colores aleatorios: " + seleccionColores);
      
   }   
}
