package org.example.animals.conejo;

public class Conejo{

    private String Nombre;
    private String color;
    private String sexo;

    //CONSTRUCTOR
    public Conejo(String nombre, String color, String sexo) {
        Nombre = nombre;
        this.color = color;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Conejo{" +
                "Nombre='" + Nombre + '\'' +
                ", color='" + color + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    //GET Y SET
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
