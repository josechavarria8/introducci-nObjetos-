/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import src;
import java.util.Scanner;

/**
 *
 * @author blue
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
            Scanner scanner = new Scanner(System.in);
        //contador
 	System.out.println("");
       System.out.println("Contador");
       System.out.println("");
           Contador co = new Contador();
           Contador con =co;
        int n;
        System.out.println("Introduce valor para inicializar el contador: ");                                     
        n = scanner.nextInt();      
        con.setContador(n);
        co.incrementar();
        System.out.println(co.getContador());
        
        
        
        
        //circulo
       System.out.println("");
       System.out.println("Circulo");
       System.out.println("");
        Circulo c = new Circulo(5);
        Circulo a = c;
        a.setRadio(8);
        
        c.area();
        c.perimetro();
        
        //cuadrado
        System.out.println("");
       System.out.println("Cuadrado");
       System.out.println("");
        int lado;
        
        System.out.println("Ingrese el lado");
        lado = scanner.nextInt(); 
        Cuadrado cu = new Cuadrado(5);
        Cuadrado cu2 = cu;
        cu2.setLado(lado);
        cu.area();
        cu.perimetro();
        
        //rectangulo
 	System.out.println("");
       System.out.println("rectangulo");
       System.out.println("");
         int ancho;
        int largo;
        
       Rectangulo r = new Rectangulo(10,10);
       
       
        System.out.println("Ingrese el ancho");
        ancho = scanner.nextInt();
        do{
        System.out.println("Ingrese el largo");
        largo = scanner.nextInt();
       
        }while (ancho == largo);
        Rectangulo re = r;
   
        r.area();
        r.perimetro();
        
        
        // libro
	 System.out.println("");
       System.out.println("Libro");
       System.out.println("");
        String nombre;
        boolean prestado;
        
        Libro l = new Libro("jose",false);
        l.mostrarInformacion();
        Libro li = l;
        li.Prestamo();
        l.mostrarInformacion();
        
        // fraccion
	 System.out.println("");
       System.out.println("Fraccion");
       System.out.println("");
        int num1 = 0, denom1 = 0, num2 = 0, denom2 = 0;
        Fracciones f = new Fracciones (2,4,3,8);
        Fracciones fr =f;
        System.out.println("Ingrese primer numerador");
        ancho = scanner.nextInt();
        fr.setNum1(num1);
         System.out.println("Ingrese primer denominador");
        ancho = scanner.nextInt();
        fr.setNum1(denom1);
         System.out.println("Ingrese segundo numerador");
        ancho = scanner.nextInt();
        fr.setNum1(num2);
        
        
         System.out.println("Ingrese segundo denominador");
        ancho = scanner.nextInt();
        fr.setNum1(denom2);
        
        f.multiplicar();
        
        f.dividir();
        f.sumar();
        f.restar();
    
    }
    
}
