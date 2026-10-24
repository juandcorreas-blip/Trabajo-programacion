public class Automovil extends Vehiculo {

    private int numeroPuertas;

    public Automovil(String placa, String marca, String modelo, int anioFabricacion,
                     EstadoVehiculo estado, int numeroPuertas) {
        super(placa, marca, modelo, anioFabricacion, estado);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
}
