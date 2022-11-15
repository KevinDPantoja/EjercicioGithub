public class Oso {
    private String color;
    private String altura;
    private String peso;

    public Oso(String color, String altura, String peso) {
        this.color = color;
        this.altura = altura;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    @Override
    public String toString() {
        return "Oso{" +
                "color='" + color + '\'' +
                ", altura='" + altura + '\'' +
                ", peso='" + peso + '\'' +
                '}';
    }
}