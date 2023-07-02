public class Camisa extends Prenda {
    private String color;

    public Camisa(String tipo, String talla, String color) {
        super(tipo, talla);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void desplegarInformacion() {
        super.desplegarInformacion();
        System.out.println("Color: " + color);
    }
}
