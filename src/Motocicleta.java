public class Motocicleta extends Vehiculo {

    private static final double DESCUENTO = 0.10;

    private int cilindraje;

    public Motocicleta(String placa, String marca, String modelo, int anioFabricacion,
                       EstadoVehiculo estado, int cilindraje) {
        super(placa, marca, modelo, anioFabricacion, estado);
        this.cilindraje = cilindraje;
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        return (TARIFA_BASE * dias) - (TARIFA_BASE * dias * DESCUENTO);
    }

    public int getCilindraje() {
        return cilindraje;
    }
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
}