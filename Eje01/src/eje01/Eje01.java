package eje01;

public class Eje01 {

    public static void main(String[] args) {
        Persona persona = null;
        //System.out.println(persona.getEdad());
        try {
            if (persona.esMayorDeEdad()) {
                System.out.println("Es mayor.");
            } else {
                System.out.println("Es menor");
            }
        }catch(NullPointerException e){
            System.out.println("No se ha encontrado una persona");
        }catch(Exception e){
            System.out.println("Algo salio mal");
        }finally{
            System.out.println("Saliendo");
        }

    }

}
