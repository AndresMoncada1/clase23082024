
public class Vehiculo
{
    //atributos
   protected String marca;
   protected String modelo;
   protected int anioFabricacion;
   //constructor
   public Vehiculo(){}
   
   public Vehiculo(String marca, String modelo, int anioFabricacion){
    
this.marca=marca;
this.modelo=modelo;
this.anioFabricacion=anioFabricacion;}
//getters&setters

    public String getMarca(){
    return marca;}
    public void setMarca(String marca){
    this.marca=marca;}
    
    public String getModelo(){
    return modelo;}
    public void setModelo(String modelo){
    this.modelo=modelo;}
    
    public int getAnioFabricacion(){
    return anioFabricacion;}
    public void setAnioFabricacion(int anioFabricacion){
    this.anioFabricacion=anioFabricacion;}
    
    //metodos operacionales 
    
    public void mostrarDetalles(){
    System.out.println("La marca del vehiculo es:"+marca);
    System.out.println("El modelo del vehiculo es:"+modelo);
    System.out.println("El año en el cual el vehiculo fue fabricado es:"+anioFabricacion);
}
    
}
