package edu.clase1.ejemplos;

import edu.clase1.dominio.Cuadrado;

public class Ejemplo2 {

    public void iniciarEjemplo(){
        Cuadrado cuadrado = new Cuadrado(2);

        int perimetroDelCuadrado = cuadrado.dameTuPerimetro();

        int superficieDelCuadrado = cuadrado.dameTuSuperificie();

        System.out.println(perimetroDelCuadrado);
        System.out.println(superficieDelCuadrado);
    }
}
