package main.java.modelo.dto;

public class RolUsuario {
	 private int usuarioId;
	 private int rolId;
	@Override
	public String toString() {
		return "RolUsuario [usuarioId=" + usuarioId + ", rolId=" + rolId + "]";
	}
	public int getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}
	public int getRolId() {
		return rolId;
	}
	public void setRolId(int rolId) {
		this.rolId = rolId;
	}
	public RolUsuario(int usuarioId, int rolId) {
		super();
		this.usuarioId = usuarioId;
		this.rolId = rolId;
	}
}
