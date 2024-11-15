package m4s17.ejercicio2.model;

public class Usuario {
    private int idUsuario;
    private String nombre;
    private String rut;
    private String correoElectronico;

    public Usuario(int idUsuario, String nombre, String rut, String correoElectronico) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.rut = rut;
        this.correoElectronico = correoElectronico;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }
}
