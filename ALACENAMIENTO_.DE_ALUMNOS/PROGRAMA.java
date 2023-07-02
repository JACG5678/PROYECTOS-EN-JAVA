import java.util.Scanner;

public class PROGRAMA
{
    public static void main (String args[])
    {
        String nombre;
        int edad;
        char sexo;
        
        Scanner leer = new Scanner (System.in);
        Alumno alum[] = new Alumno [5];
        
        
        for (int i = 0; i < alum.length; i++){
            System.out.println("Ingresa el nombre del alumno");
            nombre = leer.nextLine();
            
            System.out.println("Ingresa la edad del alumno");
            edad = leer.nextInt();
            
            System.out.println("Ingresa el sexo del alumno");
            sexo = leer.next().charAt(0);
            
            alum[i] = new Alumno(nombre, edad, sexo);
            leer.nextLine();
            
        }
        for (Alumno alumno1 : alum){
            System.out.println(alumno1.getNombre() + "\t" + alumno1.getEdad() +
            "\t" + alumno1.getSexo());
        }
    }
}
