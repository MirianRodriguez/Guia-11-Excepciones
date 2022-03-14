/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje03;

/**
 *
 * @author mirod
 */
public class DivisionNumero {
    int dividendo;
    int divisor;

    public DivisionNumero() {
    }

    public DivisionNumero(int dividendo, int divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }
    
    public void dividir(){
        try{
            System.out.println("El resultado de la division es: " + dividendo/divisor);
        }catch(ArithmeticException e){
            System.out.println("No se puede realizar la division por cero.");
        }finally{
            System.out.println("Division finalizada.");
        }
    }
}
