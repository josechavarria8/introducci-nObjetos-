/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author blue
 */
public class Circulo {
    
     private double radio;
  

    public Circulo(double radio) {
        
        this.radio = radio;
        
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double area() {
        
      double area = radio * radio*Math.PI;
      System.out.println(area);
      return area;
        
    }
     public double perimetro() {
        
       double perimetro = radio * 2* Math.PI ;
       System.out.println(perimetro);
       return perimetro;
        
        
    }
    
}
