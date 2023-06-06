
package Cola;

import java.util.Arrays;

/**
 *
 * @author Miguel
 */
public class Cola {
    int ultimo;
    Integer[] tabla;
    
    public Cola(){
        ultimo = -1;
        tabla = new Integer[10]; 
    }
    public Cola(int capacidad){
        ultimo = -1;
        tabla = new Integer[capacidad];
                
    }
    boolean vacia(){
        return ultimo == -1;
    }
    boolean llena(){
        return ultimo == tabla.length -1;
    }
    void encola(Integer elemento){
        if(llena()){
            tabla = Arrays.copyOf(tabla, tabla.length + 10);
        }
        ultimo++;
        tabla[ultimo] = elemento;
    }
    Integer desencola(){
        Integer elemento = null;
        if (!vacia()){
            elemento = tabla[0];
            for (int i=0; i<ultimo; i++){  
                tabla[i] = tabla[i + 1];
            }
            ultimo--;
        } return elemento;
    }
    public String primero(){
         String resultado = "(primero)";
        for(int i=0; i<=ultimo; i++){
            resultado += tabla[i] + " ";
        } 
        resultado += "(ultimo)";
        return resultado;
    }  
}
