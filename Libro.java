/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author blue
 */
public class Libro {
      private String nombre;
    
    private boolean prestado;
    
    public Libro() {
    }
    
    public Libro(String nombre, boolean prestado) {
        this.nombre = nombre;
        this.prestado = prestado;
    }
    
    public void Prestamo() {
      prestado = true;
    }
      public void Devolucio() {
     prestado = false;
    }
        public void mostrarInformacion() {
            String estado;
            if( prestado == true){
                estado = "Prestado";
            System.out.println( "Libro" + nombre + " estado =" + estado  );
            }else if( prestado == false){
                 estado = "Disponible";
            System.out.println( "Libro" + nombre + " estado =" + estado  );
        }
    }

  
    
    
    
}
