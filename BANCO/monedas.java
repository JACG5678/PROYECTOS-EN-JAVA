import java.util.Scanner;

public class monedas
{
    public static void convertir (double valorpesomexicano, String pais){
        
        Scanner leer= new Scanner(System.in);
        System.out.println("INGRESA LA CANTIDAD AH INTERCAMBIAR:   ,PAIS");
        double cantidadDeMoneda = leer.nextDouble();
        
        double pesos = cantidadDeMoneda / valorpesomexicano;
        pesos = (double) Math.round(pesos* 100d)/100;
        
        System.out.println("-----------------------------");        
        System.out.println(" Tienes $"+pesos+" pesos mexicanos");        
        System.out.println("-----------------------------");
        
        double Dolares = cantidadDeMoneda / valorpesomexicano;
        pesos = (double) Math.round(pesos* 100d)/100;
        
        System.out.println("-----------------------------");        
        System.out.println(" Tienes $"+Dolares+" dolares");        
        System.out.println("-----------------------------");
        
        double Euro = cantidadDeMoneda / valorpesomexicano;
        pesos = (double) Math.round(pesos* 100d)/100;
        
        System.out.println("-----------------------------");        
        System.out.println(" Tienes $"+Euro+" euros");        
        System.out.println("-----------------------------");
        
        double Dolarescanadienses = cantidadDeMoneda / valorpesomexicano;
        pesos = (double) Math.round(pesos* 100d)/100;
        
        System.out.println("-----------------------------");        
        System.out.println(" Tienes $"+Dolarescanadienses+" dolar canadiense");        
        System.out.println("-----------------------------");  
    
    }
}