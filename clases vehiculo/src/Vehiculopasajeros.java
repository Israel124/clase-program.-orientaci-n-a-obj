//cehiculos pasajeros.java
public class Vehiculopasajeros extends vehiculo{
    
    private int numpasajeros;

    //constructor
    public Vehiculopasajeros(String marca, String modelo, int año, int kilometraje, int numpasajeros){
        super(marca, modelo, año, kilometraje);
        this.numpasajeros = numpasajeros;
    }

    //getters y setters
    public int getnumpasajeros(){
        return numpasajeros;
    }
    public void setnumpasajeros(int numpasajeros){
        this.numpasajeros = numpasajeros;
    }

    //sobreescribir
    @Override
    public void mostrarinfo(){
        super.mostrarinfo();
        System.out.println("Número de pasajeros: " + numpasajeros);
    }
}
