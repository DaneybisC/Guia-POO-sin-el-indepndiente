public class Camion extends Vehiculocarga {
    private int numEjes;

    public Camion (String marca, String modelo, int año, int kilometraje, int capacidadCarga, int numEjes){
        super(marca, modelo, año, kilometraje, capacidadCarga);
        this.numEjes = numEjes;
    }

    public int getNumEjes(){
        return numEjes;
    }

    public void setNumEjes(int numEjes){
        this.numEjes = numEjes;
    }

    @Override
    public void mostrarInfo (){
        super.mostrarInfo();
        System.out.println("Número de ejes: "+numEjes);
    }

    public void realizarMantenimientoCa(){
        System.out.println("El camión debe realizar este mantenimiento:");
        System.out.println("1) Análisis de los mecanismos de dirección.");
        System.out.println("2) Revisión de los niveles de lubricantes.");
        System.out.println("3) Inspección de los sistemas de combustible y escape.");
    }

    public int calcularCostoMantenimiento1(int costoporkm1, int kilometrosRecorridos1){
        int costoTotal = costoporkm1 * kilometrosRecorridos1;
        return costoTotal;
    }
}
