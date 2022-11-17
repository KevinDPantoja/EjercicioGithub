package org.example.animals.pangolin;

public class Pangolin {
    //se crean las variables de nombre peso y altura del pangolin
    private String nombre;
    private int peso;
    private int altura;
    //se crea el constructor del pangolin
    public Pangolin(String nombre, int peso, int altura) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
    }
    //se crean los getter y setter del pangolin
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
