public class Jose {
    public static void main(String[] args) {
        Camisa camisa = new Camisa("Camisa", "M", "Azul");
        Calcetines calcetines = new Calcetines("Calcetines", "L", "Algodón");
        Pantalones pantalones = new Pantalones("Pantalones", "32", 30);
        Chamarra chamarra = new Chamarra("Chamarra", "XL", "Cuero");

        camisa.setColor("Rojo");
        calcetines.setMaterial("Lana");
        pantalones.setLongitud(32);
        chamarra.setMaterial("Poliéster");

        camisa.desplegarInformacion();
        System.out.println();
        calcetines.desplegarInformacion();
        System.out.println();
        pantalones.desplegarInformacion();
        System.out.println();
        chamarra.desplegarInformacion();
        System.out.println();

        Prenda prenda = new Prenda("Prenda genérica", "S");
        prenda.desplegarInformacion();
    }
}
