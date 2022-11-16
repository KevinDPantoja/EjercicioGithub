package org.example.animals.perro;

public class Perro {
    //Se crean los atributos de la clase
    private String nombre;
    private String raza;
    private String peso;
    private String edad;
    private String funcionalidad;

    //Se crea el Metodo constructor
    public Perro(String nombre,String raza,String peso,String edad,String funcionalidad){
        this.nombre=nombre;
        this.raza=raza;
        this.peso=peso;
        this.edad=edad;
        this.funcionalidad=funcionalidad;}

    //Se crean los setter y getter
    public String getNombre(){
        return nombre;}

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getRaza(){
        return raza;}

    public void setRaza(String raza){
        this.raza=raza;
    }

    public String getFuncionalidad(){
        return funcionalidad;}

    public void setFuncionalidad(String funcionalidad){
        this.funcionalidad=funcionalidad;
    }

    public String getPeso(){
        return peso;}

    public void setPeso(String peso){
        this.peso=peso;
    }

    public String getEdad(){
        return edad;}

    public void setEdad(String edad){
        this.edad=edad;
    }

    //
    public void infoPerro(){
        System.out.println("El perro " +nombre+ " es de raza:" +raza+ ",tiene un peso de: " +peso+ ", tiene la edad de: " +edad +", su funcionalidad principal es: " +funcionalidad);
    }
}
