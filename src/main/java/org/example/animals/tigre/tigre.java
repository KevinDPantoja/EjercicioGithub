package org.example.animals.tigre;
public class tigre {
    private String genero;
    private String altura;
    private String peso;
    private String edad;
    private String longitudColmillos;

    // Se agrega el constructor
    public tigre(String genero, String altura, String peso, String edad, String longitudColmillos) {
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
        this.longitudColmillos = longitudColmillos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getLongitudColmillos() {
        return longitudColmillos;
    }

    public void setLongitudColmillos(String longitudColmillos) {
        this.longitudColmillos = longitudColmillos;
    }

    @Override
    public String toString() {
        return "Tigre{" +
                "genero ='" + genero + '\'' +
                ", altura='" + altura + '\'' +
                ", peso='" + peso + '\'' +
                '}';
    }
}