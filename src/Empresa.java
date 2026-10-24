import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nombre;
    private String ciudad;
    private List<Cliente> listEmpresaCliente;
    private List<Vehiculo> listEmpresaVehiculo;
    private List<Alquiler> listEmpresaAlquiler;

    public Empresa(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.listEmpresaCliente = new ArrayList<>();
        this.listEmpresaVehiculo = new ArrayList<>();
        this.listEmpresaAlquiler = new ArrayList<>();
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

    public void setListEmpresaCliente(List<Cliente> listEmpresaCliente) {
        this.listEmpresaCliente = listEmpresaCliente;
    }

    public List<Vehiculo> getListEmpresaVehiculo() {
        return listEmpresaVehiculo;
    }

    public void setListEmpresaVehiculo(List<Vehiculo> listEmpresaVehiculo) {
        this.listEmpresaVehiculo = listEmpresaVehiculo;
    }

    public List<Alquiler> getListEmpresaAlquiler() {
        return listEmpresaAlquiler;
    }

    public void setListEmpresaAlquiler(List<Alquiler> listEmpresaAlquiler) {
        this.listEmpresaAlquiler = listEmpresaAlquiler;
    }
}
