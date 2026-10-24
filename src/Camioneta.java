public class Camioneta extends Vehiculo {

    private double capacidadCargaKg;

    public Camioneta(String placa, String marca, String modelo, int anioFabricacion,
                     EstadoVehiculo estado, double capacidadCargaKg) {
        super(placa, marca, modelo, anioFabricacion, estado);
        this.capacidadCargaKg = capacidadCargaKg;
    }

    public double getCapacidadCargaKg() {
        return capacidadCargaKg;
    }

    public void setCapacidadCargaKg(double capacidadCargaKg) {
        this.capacidadCargaKg = capacidadCargaKg;
    }
}
