//auto. java
public class Auto extends Vehiculopasajeros {
    
  private String Tipocombustible;

  //constructor
  public Auto(String marca, String modelo, int año, int kilometraje, String Tipocombustible){
    super(marca, modelo, año, kilometraje, kilometraje);
    this.Tipocombustible = Tipocombustible;
  }

  //getters y setters
  public String getTipocombustible(){
    return Tipocombustible;
  }
  public void setTipocombustible(String Tipocombustible){
    this.Tipocombustible = Tipocombustible;
  }
  //sobreescribir método de mostrara info
  @Override
  public void mostrarinfo(){
    super.mostrarinfo();
    System.out.println("Tipo de combustible: " + Tipocombustible);
  }

  @Override
  public void realizarMantenimiento(){
    super.realizarMantenimiento();
    System.out.println("estamos revisado el aceite, los neumáticos, los frenos, entre otras cosas Básicas ...");
  }

  public double calcularcostomant(double costoporKM, int KMrecoridos){
    double costoTotal = costoporKM * KMrecoridos;
    return costoTotal;
  }

}
