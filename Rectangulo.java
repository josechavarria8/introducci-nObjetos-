/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author blue
 */
public class Rectangulo {
    
     private int ancho;
      private int largo;
 
      
    public Rectangulo(int ancho, int largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    
    public int area() {
        
      int area = ancho * largo;
      System.out.println(area);
      return area;
        
    }
     public int perimetro() {
        
       int perimetro = ancho + ancho + largo +largo ;
         System.out.println(perimetro);
      return perimetro;
        
        
    }
    
    
    
    
}
