public abstract class Vehiculo {

    protected static final double TARIFA_BASE = 10000;

    private String placa;
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private EstadoVehiculo estado;

    public Vehiculo(String placa, String marca, String modelo, int anioFabricacion, EstadoVehiculo estado) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.estado = estado;
    }

    public abstract double calcularCostoAlquiler(int dias);

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }
    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public EstadoVehiculo getEstado() {
        return estado;
    }
    public void setEstado(EstadoVehiculo estado) {
        this.estado = estado;
    }
}