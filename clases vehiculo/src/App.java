public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //crear instancias
        Auto au = new Auto("Toyota", "Corolla", 2020, 15000, "gasolina");
        Camion cm = new Camion("Volvo", "FH", 2019, 750000, 20000, 4);

        //mostrar de info de cada vehiculo
        System.out.println("Información del Auto");
        au.mostrarinfo();

        System.out.println("Información del Camión");
        cm.mostrarinfo();
    }
}
