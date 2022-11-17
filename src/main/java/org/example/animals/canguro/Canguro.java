package org.example.animals.canguro;
import java.io.PrintStream;

public class Canguro implements MostrarDatosCanguro {
    private String edad;
    private String color;
    private String cantidadHijos;

    public Canguro(String edad, String color, String cantidadHijos) {

        this.edad = edad;
        this.color = color;
        this.cantidadHijos = cantidadHijos;
    }


    public String getEdad() {
        return this.edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCantidadHijos() {
        return this.cantidadHijos;
    }

    public void setCantidadHijos(String cantidadHijos) {
        this.cantidadHijos = cantidadHijos;
    }

    @Override
    public void mostrarInformacion() {
        PrintStream var10000 = System.out;
        var10000.println("El Canguro de  tiene una edad de " + this.getEdad() + " aÃ±os, su color de pelaje es " + this.getColor() + " y tiene " + this.getCantidadHijos() + " Hijos .");
    }
}