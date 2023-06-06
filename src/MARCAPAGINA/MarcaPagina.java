
package MARCAPAGINA;

public class MarcaPagina {
    int numPag;
    int ultimaPaginaLeida;
    
public MarcaPagina(int numPag){
    this.numPag = numPag;
    ultimaPaginaLeida=1;
   
}
public void siguientePag(){     
            ultimaPaginaLeida++;        
    }

public int ultimaPaginaLeida(){
    return ultimaPaginaLeida;
}
public void comenzar(){
    ultimaPaginaLeida = 1;
}    
}
