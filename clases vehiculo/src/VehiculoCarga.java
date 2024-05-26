//vehiculo carga.java
public class VehiculoCarga extends vehiculo {

    private int capacidadCarga;

    //constuctor
    public VehiculoCarga(String marca, String modelo, int año, int kilometraje, int capacidadCarga){
        super(modelo, modelo, año, kilometraje);
        this.capacidadCarga = capacidadCarga;
    }

    //getters y setters
    public int getcapacidadCarga(){
        return capacidadCarga;
    }
    public void setcapacidadCarga(int capacidadCarga){
        this.capacidadCarga = capacidadCarga;
    }

    //sobrescribir mostrar info
    @Override
    public void mostrarinfo(){
        super.mostrarinfo();
        System.out.println("Capacidad de Carga: " + capacidadCarga + " Kg");
    }

}
