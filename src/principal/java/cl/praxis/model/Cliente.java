package cl.praxis.model;

public class Cliente {

    private String runcliente;
    private String nombreCliente;
    private String apellidoCliente;
    private String anioCliente;
    private CategoriaEnum estado;

    public Cliente() {
    }

    public Cliente(String runcliente, String nombreCliente, String apellidoCliente, String anioCliente, CategoriaEnum estado) {
        this.runcliente = runcliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.anioCliente = anioCliente;
        this.estado = estado;
    }

    public String getRuncliente() {
        return runcliente;
    }

    public void setRuncliente(String runcliente) {
        this.runcliente = runcliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getAnioCliente() {
        return anioCliente;
    }

    public void setAnioCliente(String anioCliente) {
        this.anioCliente = anioCliente;
    }

    public CategoriaEnum getEstado() {
        return estado;
    }

    public void setEstado(CategoriaEnum estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return
                "Run del cliente: " + runcliente + '\n' +
                "Nombre del cliente: " + nombreCliente + '\n' +
                "Apellido del cliente: " + apellidoCliente + '\n' +
                "Anhios como cliente: " + anioCliente + '\n' +
                "Categoria del cliente: " + estado + '\n';
    }
}
