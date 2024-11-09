package modelo;

public class SupportCase {
    private String nombre;
    private String correo;
    private String motivoConsulta;
    private String ciudad;
    private String pais;

    public SupportCase(String nombre, String correo, String motivoConsulta) {
        this.nombre = nombre;
        this.correo = correo;
        this.motivoConsulta = motivoConsulta;
    }

    // Getters y setters para los atributos
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Registro de soporte:\n" +
                "Nombre: " + nombre + "\n" +
                "Correo: " + correo + "\n" +
                "Motivo de consulta: " + motivoConsulta + "\n" +
                "Ubicación: " + ciudad + ", " + pais;
    }
}