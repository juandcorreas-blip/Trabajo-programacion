public class Camioneta extends Vehiculo {

    private static final double RECARGO = 50000;

    private double capacidadCargaKg;

    public Camioneta(String placa, String marca, String modelo, int anioFabricacion,
                     EstadoVehiculo estado, double capacidadCargaKg) {
        super(placa, marca, modelo, anioFabricacion, estado);
        this.capacidadCargaKg = capacidadCargaKg;
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        return (TARIFA_BASE + RECARGO) * dias;
    }

    public double getCapacidadCargaKg() {
        return capacidadCargaKg;
    }
    public void setCapacidadCargaKg(double capacidadCargaKg) {
        this.capacidadCargaKg = capacidadCargaKg;
    }
}