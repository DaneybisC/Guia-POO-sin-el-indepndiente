public class Vehiculocarga extends Vehiculo {

    private int capacidadCarga;

    //constructor
    public Vehiculocarga(String marca, String modelo, int año, int kilometraje, int capacidadCarga){
        super(marca, modelo, año, kilometraje);
        this.capacidadCarga = capacidadCarga;
    }

    //Getter y setter para capacidadCarga
    public int getCapacidadCarga(){
        return capacidadCarga;
    }
    
    public void setCapacidadCarga(int capacidadCarga){
        this.capacidadCarga = capacidadCarga;
    }

    //sobrescribir el método mostrarinfo
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Capacidad de carga: " +capacidadCarga+" kg");
    }
}
