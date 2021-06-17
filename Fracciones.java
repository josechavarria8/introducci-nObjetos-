/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author blue
 */
public class Fracciones {
    
    private int num1, denom1, num2, denom2, numeradores, denominadores;
    private double resultado;

    public Fracciones(int num1, int denom1, int num2, int denom2) {
        this.num1 = num1;
        this.denom1 = denom1;
        this.num2 = num2;
        this.denom2 = denom2;
   
    }


    public double sumar() {

        if (denom1 == denom2) {
            numeradores = num1 + num2;
            resultado = (double) numeradores / denom1;
        } else {
            numeradores = num1*denom2 + num2*denom1;
            denominadores = denom1 * denom2;
            resultado = (double) numeradores / denominadores;
        }
         System.out.println(resultado);
        return resultado;
    }

    public double restar() {
        
        if (denom1 == denom2) {
            numeradores = num1 - num2;
            resultado = (double) numeradores / denom1;
        } else {
            numeradores = num1*denom2 - num2*denom1;
            denominadores = denom1 * denom2;
            resultado = (double) numeradores / denominadores;
        }
         System.out.println(resultado);
        return resultado;
    }

    public double multiplicar() {
        numeradores = num1 * num2;
        denominadores = denom1 * denom2;
        double resultado = (double) numeradores / denominadores;
         System.out.println(resultado);
        return resultado;
    }

    public double dividir() {
        numeradores = num1 * denom2;
        denominadores = denom1 * num2 ;
        double resultado = (double) numeradores / denominadores;
        System.out.println(resultado);
        return resultado;
    }

    public int getNum1() {
        return num1;
    }

    public int getDenom2() {
        return denom2;
    }

    public void setDenom2(int denom2) {
        this.denom2 = denom2;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getDenom1() {
        return denom1;
    }

    public void setDenom1(int denom1) {
        this.denom1 = denom1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

}
