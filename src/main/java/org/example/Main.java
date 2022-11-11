package org.example;

import org.example.animals.carpincho.CarpinchoController;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // NO BORRAR Crear un objeto de la clase CarpinchoController
        CarpinchoController carpincho = new CarpinchoController();
        carpincho.crearCarpincho("Carpincho", 54, 1.2);
        carpincho.mostrarCarpincho();

    }
}