package edu.clase1.ejemplos;

import edu.clase1.dominio.Persona;

public class Ejemplo1 {

    //Creo una persona con un nombre y hago que salude.
    public void iniciarEjemplo(){
        Persona persona = new Persona("Belen","Gerez");


        //No lo rompo
        String nombreCompleto = persona.dameTuNombreCompleto();


        //Rompiendo el encapsulamiento
        String nombre = persona.getNombre();

        String apellido = persona.getApellido();
        //persona.setNombre("Maria");


        //String saludo = persona.saludar();

        //System.out.println(saludo);

        System.out.println(nombreCompleto);
    }
}
