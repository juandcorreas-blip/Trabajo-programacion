public class Turista extends Cliente {

    private String visa;

    public Turista(String nombre, String correo, String documentoIdentidad, String visa) {
        super(nombre, correo, documentoIdentidad);
        this.visa = visa;
    }

    public String getVisa() {
        return visa;
    }

    public void setVisa(String visa) {
        this.visa = visa;
    }
}
