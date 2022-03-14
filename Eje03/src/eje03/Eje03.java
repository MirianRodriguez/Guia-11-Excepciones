/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje03;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class Eje03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String valor1, valor2;
        int dividendo, divisor;
        System.out.println("Ingrese el dividendo");
        valor1 = leer.next();
        System.out.println("Ingrese el divisor");
        valor2 = leer.next();
        try{
            dividendo = Integer.parseInt(valor1);
            divisor = Integer.parseInt(valor2);
            DivisionNumero division = new DivisionNumero(dividendo, divisor);
            division.dividir();
        }catch(NumberFormatException e){
            System.out.println("Alguno de los valores ingresados no es entero.");
        }
    }
    
}
