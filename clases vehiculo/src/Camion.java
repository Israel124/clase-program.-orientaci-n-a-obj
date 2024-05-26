public class Camion extends VehiculoCarga{

    private int numejes;

    //constuctor
    public Camion(String marca, String modelo, int año, int kilometraje, int capacidadCarga, int numejes){
        super(marca, modelo, año, kilometraje, kilometraje);
        this.numejes = numejes;
    }

    //getters y setters
    public int getnumejes(){
        return numejes;
    }
    public void setnumejes(int numejes){
        this.numejes = numejes;
    }

    //sobreescritura del método de mostrar info
    @Override
    public void mostrarinfo(){
      super.mostrarinfo();
      System.out.println("Número de ejes: " + numejes);
    }
        
}
