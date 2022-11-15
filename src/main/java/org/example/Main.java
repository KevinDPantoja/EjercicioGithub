package org.example;

import org.example.animals.carpincho.CarpinchoController;
import org.example.animals.gato.Gato;
import org.example.animals.caballo.Caballo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // NO BORRAR Crear un objeto de la clase CarpinchoController y mostrar el carpincho por pantalla
        CarpinchoController carpincho = new CarpinchoController();
        carpincho.crearCarpincho("Carpincho", 54, 1.2);
        carpincho.mostrarCarpincho();

        // NO BORRAR: Crea el objeto Gato y se aplica el método para mostrar los resultados.
        Gato gato = new Gato ("persa", "2","blanco","4");
        gato.mostrarInformacion();

        Caballo caballo = new Caballo ("Pura sangre", "Mamifero", "500 Kg", "Negro, marrón, gris", "1.57 cm - 175cm", "20 a 25");
        caballo.MostrarCaballo();
    }
}
