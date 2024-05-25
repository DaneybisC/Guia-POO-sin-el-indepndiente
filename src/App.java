public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("¡Hola!");

        Auto auto = new Auto("Toyota", "Corolla", 2020, 15000, 5, "Gasolina");

        Camion camion = new Camion("Volvo", "FH", 2019, 75000, 20000, 4);

        System.out.println("Información del auto:");
        auto.mostrarInfo();

        System.out.println("\nInformación del camión");
        camion.mostrarInfo();
    }
}
