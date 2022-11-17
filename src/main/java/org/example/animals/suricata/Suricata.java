package org.example.animals.suricata;


/**
 *
 * @author Juan David Aldana
 */


public class Suricata {

    private String nombre;
    private String color;
    private String sexo;
    private String peso;

    public Suricata(String nombre, String color, String sexo, String peso) {
        this.nombre = nombre;
        this.color = color;
        this.sexo = sexo;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }


    public void ImprimirInfoSuricata() {
        System.out.println("\nEl suricata tiene el nombre: "+nombre+"\nEs de color: "+
                color+ " \nsu peso aproximado es: "+peso+"\nsu sexo es: "+sexo);

    }


}
