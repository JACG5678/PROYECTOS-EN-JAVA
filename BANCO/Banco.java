
import java.util.Scanner;
 public class Banco {
     public static void main(String[] args) {    
      monedas.imprimirDatos();
      EXTERNO: 
         while(true){ 
    System.out.println("Conversion de Monedas");           
    System.out.println("1- Dolares a Pesos Mexicanos\n"
     + "2- Pesos Mexicanos a Dolares \n"                   
     + "3- Euros a Pesos Mexicanos\n"                   
     + "4- Pesos Mexicanos a Euros\n"                   
     + "5- Dolares Canadienses a Pesos Mexicanos\n"                   
     + "6- Pesos Mexicanos a Dolares Canadienses\n"                   
     + "7- Salir");
     System.out.println("INGRESA UN NUMERO HA ELEGIR: ");
     Scanner leer= new Scanner(System.in);
     char opcion=leer.next().charAT(0);
     
     swhich(opcion);{
         
         case "1":
         convertir(0.057,"Dolares" );
         break;
         case "2":
         convertir(17.4632,"pesos" );
         break;
         case "3":
         convertir(0.052,"Euro" );
         break;
         case "4":
         convertir(19.0071,"pesos" );
         break;
         case "5":
         convertir(0.077,"Dolares Canadiences" );
         break;
         case "6":
         convertir(12.9686,"pesos" );
         break;
         case "7":
         System.out.println("salir");
         default:
         System.out.println("opcion incorrecto");
         break;
        }
      }
    }
}