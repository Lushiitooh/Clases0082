package main.java.modelo.dto;

public class Direccion {
    private int id;
    private String nombre;
    private String numeracion;
    private int usuarioId;
	@Override
	public String toString() {
		return "Direccion [id=" + id + ", nombre=" + nombre + ", numeracion=" + numeracion + ", usuarioId=" + usuarioId
				+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumeracion() {
		return numeracion;
	}
	public void setNumeracion(String numeracion) {
		this.numeracion = numeracion;
	}
	public int getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}
	public Direccion(int id, String nombre, String numeracion, int usuarioId) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.numeracion = numeracion;
		this.usuarioId = usuarioId;
	}
}
