package org.example.animals.caballo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author fmend
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
    //GET Y SET
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

    //METODO MOSTRAR INFORMACION
    public void MostrarCaballo() {
        System.out.println("El caballo pertenece a la raza: "+getRaza+"Pertenece a la clase: "+getClase+" ,su peso aproximado es: "+getPeso+" ,su color es: "+getColor+" mide un aproximado de: "+getEstatura+" , y su edad es: "+getEdad);
    
    }

}
