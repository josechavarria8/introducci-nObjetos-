/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author blue
 */
public class Contador {
 
    
    
      private int contador;
      
      
     

    //constructor por defecto
    public Contador() {
    }
    //constructor con parámetros
    public Contador(int contador) {
        
            this.contador = contador;
        
    }
    
    //constructor copia
    public Contador(final Contador c) {                                                                           
        contador = c.contador;
    }
    
    //getter
    public int getContador() {
        return contador;
    }

    //setter
    public void setContador(int contador) {
    
            this.contador = contador;
        
    }
    //método incrementar contador
    public void incrementar() {
        contador++;
    }

    //método decrementar contador
    public void decrementar() {
        contador--;
        
    }
}
