public class Auto extends VehiculoPasajeros{
    
    private String tipoCombustible;

    public Auto(String marca, String modelo, int año, int kilometraje, int numPasajeros, String tipoCombustible){
        super(marca, modelo, año, kilometraje, numPasajeros);
        this.tipoCombustible = tipoCombustible;
    }
   
    public String getTipoCombustible(){
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible){
        this.tipoCombustible = tipoCombustible;
    } 

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo de combustible: "+tipoCombustible);
    }

    public void realizarMantenimientoAu(){
        System.out.println("El auto necesita este mantenimiento:");
        System.out.println("1) Revisar la presión de los neumáticos.");
        System.out.println("2) Cambiar el aceite y el filtro.");
        System.out.println("3) Chequear el líquido de los frenos.");
    }

    public int calcularCostoMantenimiento(int costoporkm, int kilometrosRecorridos){
        int costoTotal = costoporkm * kilometrosRecorridos;
        return costoTotal;
    }
}

