/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author blue
 */
public class Cuadrado {
    
      private int lado;
   

    public Cuadrado(int radio) {
        
        this.lado = radio;
        
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    public int area() {
        
      int area = lado * lado;
      System.out.println(area);
      return area;
        
    }
     public int perimetro() {
        
       int perimetro = lado*4 ;
         System.out.println(perimetro);
      return perimetro;
        
        
    }
    
    
    
    
    
}
