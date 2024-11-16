package m4s17.ejercicio3.model;

public class Envio {
    private Direccion direccion;
    private String fechaEnvio;

    public Envio(Direccion direccion, String fechaEnvio) {
        this.direccion = direccion;
        this.fechaEnvio = fechaEnvio;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    @Override
    public String toString() {
        return "Envio{" +
                "direccion=" + direccion +
                ", fechaEnvio='" + fechaEnvio + '\'' +
                '}';
    }
}
