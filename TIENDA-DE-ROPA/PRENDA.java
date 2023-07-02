import java.util.Scanner;

public class PRENDA
{
    public static void main(String args[]){
        int id;
        String descripcion;
        char color;
        String talla;
        float precio;
        int contadorInstancia;
        
        CAMISA cam[] = new CAMISA[5];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < cam.length; i++){
            System.out.println("El id de la camisa es:  3");
            System.out.print( "saa" + id );
            
            System.out.println("La descripcion de la camisa es");
            
            
            System.out.println("El codigo de color de la camisa es:  ");
            
            
            System.out.println("La talla de la camisa es: ");
            

            
            System.out.println("El precio de la camisa es: ");
            
            
            System.out.println("La cantidad de existencia de camisas es:  ");
            
            
            leer.nextLine();
        }
        for (CAMISA cam3 : cam){
            System.out.println(cam3.getId() + "\t" + cam3.getDescripcion() +
            "\t" + cam3.getColor() + "\t" + cam3.getTalla() + "\t" + cam3.getPrecio() + 
            "\t" + cam3.getContadorInstancia());
        }
        
        
    }
        
}
    
    
    