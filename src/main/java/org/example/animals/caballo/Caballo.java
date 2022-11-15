/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example.animals.caballo;

/**
 *
 * @author fernandomendoza
 */

public class Caballo{


    
    private String raza, clase, peso, color, estatura, edad;

    
    //CONSTRUCTOR
    public Caballo (String raza, String clase, String peso, String color, String estatura, String Edad){


        this.raza = raza;
        this.clase = clase;
        this.peso = peso;
        this.color = color;
        this.estatura = estatura;
        this.edad = edad;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
    
    //GETTERS Y SETTERS
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }


    public void MostrarCaballo() {
        System.out.println("El caballo pertenece a la raza: "+raza+"Pertenece a la clase: "+clase+" ,su peso aproximado es: "+peso+" ,su color es: "+color+" mide un aproximado de: "+estatura+" , y su edad es: "+edad);
    
    }

}