package edu.clase1.dominio;

//Clase: Es un objeto => su responsabilidad es definir las caracteristicas y comportamiento que va
// a tener nuestro objeto
// Encapsulamiento - POO
// Capacidad que tiene un objeto de administrar su propia Informacion y toda interaccion se realiza a traves de metodos
public class Persona {

    /*
    * 3 Palabras Claves:
    * Public => todos pueden acceder
    * Private => solo el objeto puede acceder
    * Protected =>
    * */
    private String nombre;
    private String apellido;

    //Constructor
    public Persona(String nombre, String apellido){
        if (apellido == null || apellido.isEmpty()) throw new RuntimeException("No existen personas sin apellido");
        if (nombre == null || nombre.isEmpty()) throw new RuntimeException("No Existen personas sin nombre");
        this.nombre = nombre;
        this.apellido = apellido;
    }


    //Metodos => Forma de comunicarte con el objeto
    public String saludar(){
        return "Hola me llamo "+ nombre;
    }

    //Metodos Accesores
    //GETTERS
    public String getNombre(){
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String dameTuNombreCompleto(){
        return nombre + " " + apellido;
    }

    //Metodo Mutador => Cambia el valor del atributo
    //SETTER
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
