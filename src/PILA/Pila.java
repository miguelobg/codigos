
package PILA;

import java.util.Arrays;

/**
 *
 * @author Miguel
 */
public class Pila {
    int cima;
    Integer[] tabla;
    
    
    public Pila(){
        cima= -1;
        tabla = new Integer[10];
    }
    public Pila(int capacidad){
        tabla = new Integer[capacidad];
    }
    boolean vacia(){
        return cima == -1;
    }
    boolean llena(){
        return cima == tabla.length -1;
    }
    Integer cima(){
        Integer elementocima = null;
        if (!vacia()){
            elementocima = tabla [cima];
        }
         return elementocima;
    } 
    
    void apila(Integer elemento){
        if (llena()){
            tabla = Arrays.copyOf(tabla, tabla.length + 10);
        }
        cima++;
        tabla[cima]=elemento;
    }
    Integer desapila(){
        Integer elemento = null;
        if(!vacia()){
            elemento = tabla[cima];
            cima--;
        }
        return elemento;
    }
    public String mostrar(){
        String resultado = "";
        for (int i = 0; i <= cima; i++){
            resultado += tabla[i] + " ";
        }
        resultado += "(cima)";
        return resultado;
    }
    
}
    
    

