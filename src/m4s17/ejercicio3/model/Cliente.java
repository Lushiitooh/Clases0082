package m4s17.ejercicio3.model;

public class Cliente {
    private String nombre;
    private String correo;
    private Direccion direccion;

    public Cliente(String nombre, String correo, Direccion direccion) {
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

}
