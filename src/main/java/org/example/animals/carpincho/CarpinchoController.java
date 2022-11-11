package org.example.animals.carpincho;

public class CarpinchoController implements CarpinchoInterface {
    private CarpinchoModel carpincho;

    /**
     * Se crea un objeto de la clase CarpinchoModel para poder crear un carpincho
     *
     * @param nombre
     * @param peso
     * @param altura
     */
    @Override
    public void crearCarpincho(String nombre, int peso, double altura) {
        carpincho = new CarpinchoModel(nombre, peso, altura);
    }

    /**
     * Muestra los atributos del carpincho por pantalla
     */
    @Override
    public void mostrarCarpincho() {
        System.out.println("Nombre: " + carpincho.getNombre());
        System.out.println("Peso: " + carpincho.getPeso());
        System.out.println("Altura: " + carpincho.getAltura());
    }
}