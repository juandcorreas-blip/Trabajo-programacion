import java.time.LocalDate;

public class Alquiler {

    private String codigo;
    private LocalDate fecha;
    private int diasContratados;
    private Cliente cliente;
    private Vehiculo vehiculo;

    public Alquiler(String codigo, LocalDate fecha, int diasContratados, Cliente cliente, Vehiculo vehiculo) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.diasContratados = diasContratados;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getDiasContratados() {
        return diasContratados;
    }

    public void setDiasContratados(int diasContratados) {
        this.diasContratados = diasContratados;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
