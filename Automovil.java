

public class Automovil extends Vehiculo
{private int numeroPuertas;
    
    public Automovil(){}
   
    public Automovil(int numeroPuertas){
   this.numeroPuertas=numeroPuertas;
   }
   
    public Automovil(String marca, String modelo, int anioFabricacion, int numeroPuertas){
    super(marca,modelo,anioFabricacion);
    this.numeroPuertas=numeroPuertas;
    
}


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
    
    public int getNumeroPuertas(){
    return numeroPuertas;}
    public void setNumeroPuertas(int numeroPuertas){
    this.numeroPuertas=numeroPuertas;}
    
    //metodos operacionales
    @Override
    public void mostrarDetalles(){
    super.mostrarDetalles();
    System.out.println("El numero de puertas es:"+numeroPuertas);
}}
