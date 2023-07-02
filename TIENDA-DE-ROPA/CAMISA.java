
public class CAMISA 
{
    private int id;
    private String descripcion;
    private char color;
    private String talla;
    private float precio;
    private int contadorInstancia; 
    
    public CAMISA(){
        id = 3;
        descripcion = "WEEKENDE";
        color = 'b';
        talla = "M";
        precio = 500;
        contadorInstancia = 75;
        
    }
    public CAMISA (int id, String des, char col, String ta, float pre, int cont){
        this.id = id;
        this.descripcion = des;
        this.color = col;
        this.talla = ta;
        this.precio = pre;
        this.contadorInstancia = cont;
        
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String des){
        this.descripcion = des;
    }
    public char getColor(){
        return color;
    }
    public void setColor(char col){
        this.color = col;
    }
    public String getTalla(){
        return talla;
    }
    public void setTalla(String ta){
                this.talla = ta;
    }
    public float getPrecio(){
        return precio;
    }
    public void setPrecio(float pre){
        this.precio = pre;
    }
    public int getContadorInstancia(){
        return contadorInstancia;
    }
    public void setContadorInstancia(int cont){
        this.contadorInstancia = cont;
    }
    
    
}
