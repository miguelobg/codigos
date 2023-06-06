
package COLORES;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Miguel
 */
public class Colores {
    private ArrayList<String> colores = new ArrayList<String>() {{
        add("Rojo");
        add("Verde");
        add("Negro");
        add("Blanco");
    }};

    public void addColor(String color) {
        colores.add(color);
    }

    public ArrayList<String> seleccionColores(int n) {
        ArrayList<String> seleccionColores = new ArrayList<>();
        Collections.shuffle(colores);
        for (int i = 0; i < n; i++) {
            seleccionColores.add(colores.get(i));
        }
        return seleccionColores;
    }
    
}
   