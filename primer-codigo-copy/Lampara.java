

public class Lampara 
{
    String nombre, color_del_material, luz_de_color, encender,
    apagar,alumbrar  , obscurecer ; 
    
    
    public Lampara(String nom, String col , String luz, 
         String ens, String obsc, String apa, String alum){
        this.nombre = nom;
        this.color_del_material = col;
        this.luz_de_color = luz;
        this.encender = ens;
        this.obscurecer = obsc;
        this.apagar = apa;
        this.alumbrar = alum;
    }
        public void imprimirDatos(){
            System.out.println("El objeto es una: " + nombre);
            System.out.println("El color del material es: " +color_del_material);
            System.out.println("Se oprime el boton de prender y se:" +encender);
            System.out.println("El color de la luz es: "+ luz_de_color);
            System.out.println("La funcion de la lampara es:" + apagar);
            System.out.println("Al volver oprimir el boton hace:" + alumbrar);
            System.out.println("Despues de apagar pasa ah:" + obscurecer);
        }
    
}
