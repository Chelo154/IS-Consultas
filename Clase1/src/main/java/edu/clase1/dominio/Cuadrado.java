package edu.clase1.dominio;

public class Cuadrado {
    private int lado;
    
    //Constructor
    public Cuadrado(int lado){
        if(lado <= 0) throw new RuntimeException("No se pueden crear Cuadrados con lado menor o igual a 0");
        this.lado = lado;
    }

    public int dameTuPerimetro(){
        return lado * 4;
    }

    public int dameTuSuperificie(){
        return lado * lado;
    }


}
