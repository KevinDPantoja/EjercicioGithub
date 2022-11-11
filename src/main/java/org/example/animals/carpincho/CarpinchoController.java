package org.example.animals.carpincho;

public class CarpinchoController implements CarpinchoInterface {
    private CarpinchoModel carpincho;

    @Override
    public void crearCarpincho(String nombre, int peso, double altura) {
        carpincho = new CarpinchoModel(nombre, peso, altura);
    }

    @Override
    public void mostrarCarpincho() {
        System.out.println("Nombre: " + carpincho.getNombre());
        System.out.println("Peso: " + carpincho.getPeso());
        System.out.println("Altura: " + carpincho.getAltura());
    }
}