public class Calcetines extends Prenda {
    private String material;

    public Calcetines(String tipo, String talla, String material) {
        super(tipo, talla);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void desplegarInformacion() {
        super.desplegarInformacion();
        System.out.println("Material: " + material);
    }
}

