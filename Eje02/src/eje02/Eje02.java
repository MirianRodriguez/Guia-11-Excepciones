/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje02;

/**
 *
 * @author mirod
 */
public class Eje02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = new int[5];
        try{
            for (int i = 0; i < 6; i++) {
                array[i] = i;
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Indice de arreglo fuera de rango.");
        }catch(Exception e){
            System.out.println("Algo salio mal");
        }finally{
            System.out.println("Insercion finalizada");
        }
        
        System.out.println("Array ingresado: ");
        for (int i : array) {
            System.out.println(array[i]);
        }
    }
    
}
