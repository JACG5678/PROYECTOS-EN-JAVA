public class Pantalones extends Prenda {
    private int longitud;

    public Pantalones(String tipo, String talla, int longitud) {
        super(tipo, talla);
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void desplegarInformacion() {
        super.desplegarInformacion();
        System.out.println("Longitud: " + longitud);
    }
}
