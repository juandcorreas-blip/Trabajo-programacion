import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nombre;
    private String ciudad;
    private List<Cliente> listEmpresaCliente = new ArrayList<>();
    private List<Vehiculo> listEmpresaVehiculo = new ArrayList<>();
    private List<Alquiler> listEmpresaAlquiler = new ArrayList<>();

    public Empresa(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<Cliente> getListEmpresaCliente() {
        return listEmpresaCliente;
    }
    public List<Vehiculo> getListEmpresaVehiculo() {
        return listEmpresaVehiculo;
    }
    public List<Alquiler> getListEmpresaAlquiler() {
        return listEmpresaAlquiler;
    }
}