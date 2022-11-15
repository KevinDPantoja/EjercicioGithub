package org.example.animals.tortuga;

public class Tortuga implements MostrarTortuga {
    //Atributos de clase
    private String name;
    private String tipo;
    private int edad;
    private int peso;

    //Se inicializa el constructor
    public Tortuga(String name, String tipo, int edad, int peso) {
        this.name = name;
        this.tipo = tipo;
        this.edad = edad;
        this.peso = peso;
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    //Método que muestra la información del animal tortuga
    @Override
    public void mostrarTortuga() {
        System.out.println("La tortuga se llama "+getName()+ " es de tipo "+getTipo()+ " tiene "+getEdad()+" años y pesa "+getPeso()+ " kilos ");
    }
}
