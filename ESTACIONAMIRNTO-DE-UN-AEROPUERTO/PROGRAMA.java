import java.util.Scanner;

public class PROGRAMA
{
    public static void main(String args[]){

        int moneda10 = 0;
        int moneda5 = 0;
        int moneda2 = 0;
        int moneda1 = 0;
        Scanner lee = new Scanner(System.in);
        int costo = 0;
        int horas = 0;
        System.out.println("¿Cuantas horas has estado ocupando el estacionamiento?");

        horas = lee.nextInt();
        costo = horas * 17;
        if (costo > 999){
            costo = 999;
        }
        int pago = 0;
        int opcion = 0;
        while(!(pago >= costo)){
            System.out.println("Debes: $" +(costo - pago) + " Elige la opcion para el pago:1)$100, 2)$50, 3)$20, 4)$10, 5)$5, 6)$2, 7)$1");
            opcion = lee.nextInt(); 
            if (opcion == 1)
            {
                pago = pago + 100;
            }
            else{
                if (opcion == 2)
                {pago = pago + 50;

                }else{
                    if (opcion == 3)
                    {pago = pago + 20;

                    }else{
                        if (opcion == 4)
                        {pago = pago + 10;

                        }else{
                            if (opcion == 5)
                            {pago = pago + 5;

                            }else{
                                if (opcion == 6)
                                {pago = pago + 2;

                                }else{
                                    if (opcion == 7)
                                    {pago = pago + 1;

                                    }
                                    else{
                                        System.out.println("Opcioncion incorrecta");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        int cambio = 0;
        moneda10 = 0;
        moneda5 = 0;
        moneda2 = 0;
        moneda1 = 0 ;
        cambio = pago - costo; 
        if ( cambio > 0 ){
            moneda10 = cambio = cambio % 10;
            if (cambio > 0)
            {
                moneda5 = cambio / 5; cambio = cambio % 5;
            }
            else
            {
            }
            if (cambio > 0)
            {
                moneda2 = cambio / 2; cambio = cambio % 2;
            }
            else
            {
            }
            if (cambio > 0)
            {
                moneda1 = cambio / 1; cambio = cambio % 1;
            }
            else 
            {
            }
        }
        System.out.println("Cambio: " + moneda10 + " monedas de $10." + moneda5 + " monedas de $5." + moneda2 + " monedas de $2." + moneda1 + " monedas de $1.");

    }

}

