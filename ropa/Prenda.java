public class Prenda {
    private static int contadorInstancia = 0;
    private int id;
    private String tipo;
    private String talla;

    public Prenda(String tipo, String talla) {
        this.tipo = tipo;
        this.talla = talla;
        this.id = calcularId();
    }

    private int calcularId() {
        contadorInstancia += 3;
        return contadorInstancia;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void desplegarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Tipo: " + tipo);
        System.out.println("Talla: " + talla);
    }
}

