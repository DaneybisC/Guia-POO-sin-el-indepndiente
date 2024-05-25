public class VehiculoPasajeros extends Vehiculo {

    private int numPasajeros;

    //constructor
    public VehiculoPasajeros (String marca, String modelo, int año, int kilometraje, int numPasajeros){
        super(marca, modelo, año, kilometraje);
        this.numPasajeros = numPasajeros;
    }

    //Getter y setter para numPasajeros
    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros){
        this.numPasajeros = numPasajeros;
    }

    //sobrescribir el método mostrarinfo()
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Números de pasajeros: "+numPasajeros);
    }

}
