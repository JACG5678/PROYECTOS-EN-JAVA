import java.util.Scanner;

public class EXCEPCIONES {
    public static void main(String[] args) {
        try {
            EXCEPCIONES prog = new EXCEPCIONES();
            prog.operacion();
            prog.buscar();
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        } catch (NullPointerException e) {
            System.out.println("Error: La cadena es nula.");
        }
    }

    private void operacion() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Escribe un numero entero:  ");
        int val = scn.nextInt();
        System.out.printf("El valor a ocupar:  %d\n", val);
        int resultado = 25 / val;
        System.out.printf("El resultado de  25/%d - %d \n", val, resultado);
        System.out.println("Finalizada operacion.");
    }

    private void buscar() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Escribe una palabra:  ");
        String palabra = scn.next();
        String cadena = "hola familia utel!";
        if (palabra.length() % 2 == 0)
            cadena = null;
        if (cadena.contains(palabra)) {
            System.out.print("Se encontró la cadena.");
        } else {
            System.out.print("No se encontró la cadena.");
        }
    }
}
