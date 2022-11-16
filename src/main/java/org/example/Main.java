package org.example;

import org.example.animals.carpincho.CarpinchoController;
import org.example.animals.gato.Gato;
import org.example.animals.caballo.Caballo;
import org.example.animals.pangolin.PangolinController;
import org.example.animals.oso.Oso;
import org.example.animals.conejo.Conejo;
import org.example.animals.suricata.Suricata;
import org.example.animals.tortuga.Tortuga;
import org.example.animals.canguro.Canguro;
import org.example.animals.perro.Perro;

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

        // NO BORRAR: Crea el objeto Gato y se aplica el método para mostrar los resultados.
        Gato gato = new Gato ("persa", "2","blanco","4");
        gato.mostrarInformacion();

        Caballo caballo = new Caballo ("Pura sangre", "Mamifero", "500 Kg", "Negro, marrón, gris", "1.57 cm - 175cm", "20 a 25");
        caballo.MostrarCaballo();

        Oso oso = new Oso("cafe", "1.65", "80 kg");
        System.out.println(oso.toString());

        Conejo conejo = new Conejo("Carlitos", "Rojo", "Macho");
        System.out.println(conejo.toString());

        //Se crea el objeto Suricata y se muestra su información
        Suricata suricata = new Suricata("Timon","Cafe", "Macho","730 g");
        suricata.ImprimirInfoSuricata();

        //Se instacia un objeto de tipo tortuga y se setea los parametros definidos
        Tortuga tortuga = new Tortuga("Pancho", "Terrestre", 100, 250);
        tortuga.mostrarTortuga();

        //Se crea objeto tipo canguro para mostrar sus caracteristicas
        Canguro canguro = new Canguro("2","marron","1");
        canguro.mostrarInformacion();

        Perro perro = new Perro ("Maracas","Doberman","25kg","1.5 años","caza y guardia.");
        perro.infoPerro();
    }

}
