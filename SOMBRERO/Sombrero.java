
public class Sombrero
{ 
   String color;
   int talla;
   String modelo;
   int idSombrero;
   public Sombrero(String col,int ta,String mod, int id){
       this.talla = ta;
       this.idSombrero = id;
       this.color = col;
       this.modelo = mod;

   }
   public void ImprimirDatos(){
       System.out.println("voy a descolgar el sombrero");
       System.out.println("del color " + color);
       System.out.println("Este sombrero es muy comodo porque lo pedi a mi talla es " + talla);
       System.out.println("Me voy a poner.... ");
       System.out.println("Este sombrero me encata el modelo por su diceño " + modelo);
       System.out.println("Upss se me callo el sombrero voy a limpiar y solo por");
       System.out.println("El numero de identificacion ¿por que es asi? " + idSombrero );
       System.out.println("Mejor lo cuelgo y busco otro modelo y color de mi coleccion");
       
    }
    
   
}
