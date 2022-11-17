package org.example.animals.pangolin;

public class PangolinController implements  IPangolin{
    private Pangolin pangolin;

    /**
     * Se crea un objeto de la clase Pangolin para poder crear un Pangolin
     *
     * @param nombre
     * @param peso
     * @param altura
     */
    @Override
    public void crearPangolin(String nombre, int peso, int altura) {
        pangolin = new Pangolin(nombre, peso, altura);
    }

    /**
     * Muestra los atributos del pangolin por pantalla
     */
    @Override
    public void mostrarPangolin() {
        System.out.println("Nombre: " + pangolin.getNombre());
        System.out.println("Peso: " + pangolin.getPeso());
        System.out.println("Altura: " + pangolin.getAltura());
    }


}
