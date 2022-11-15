package org.example;

import org.example.animals.carpincho.CarpinchoController;
import org.example.animals.pangolin.PangolinController;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // NO BORRAR Crear un objeto de la clase CarpinchoController y mostrar el carpincho por pantalla
        CarpinchoController carpincho = new CarpinchoController();
        carpincho.crearCarpincho("Carpincho", 54, 1.2);
        carpincho.mostrarCarpincho();

        // Se crea un pangolin
        PangolinController pangolin = new PangolinController();
        pangolin.crearPangolin("Pangolin", 33, 165);
        pangolin.mostrarPangolin();
    }
}