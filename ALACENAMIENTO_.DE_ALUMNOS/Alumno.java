;import java.util.Scanner;

public class Alumno
{
    private String nombre;
    private int edad;
    private char sexo;
    Scanner leer = new  Scanner(System.in);
    public Alumno(){
        nombre = "";
        edad = 0;
        sexo = ' ' ; 
        
    }
    public Alumno(String no, int ed,char se){
        this.nombre= no;
        this.edad= ed;
        this.sexo= se;
        
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre (String no){
        this.nombre = no;
        
    }
    public int getEdad(){
        return edad;
    }
    public void setNombre (int ed){
        this.edad = ed;
        
    }
    public char getSexo(){
        return sexo;
    }
    public void setSexo(char se){
        this.sexo = se;
        
    }    
    static void mostrarDatos(String[] nombres, int[] edades, char[] sexos){
        for(int i = 0; i < nombres.length; i++){
            System.out.println("Estudiantes" + (i + 1) + ":");
            System.out.println("Nombres: " + nombres);
            System.out.println("Edades: " + edades);
            System.out.println("Sexos: " + sexos);
        }
    }
}