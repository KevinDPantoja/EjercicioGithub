package org.example.animals.ornitorrinco;

public class ornitorrinco implements ornitorrincoInterface{

    private String nombre;

    private String peso;

    private String altura;

    public ornitorrinco() {
    }

    public ornitorrinco(String nombre, String peso, String altura) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    @Override
    public void ornitorrincoNadar() {
        System.out.println("Ornitorrinco nadando" );
    }

    @Override
    public void ornitorrincoComer() {
        System.out.println("Ornitorrinco comiendo" );
    }

    @Override
    public void mostrarOrnitorrinco() {

        System.out.println("Ornitorrinco " + getNombre().toUpperCase() + " saluda"  );

    }
}
