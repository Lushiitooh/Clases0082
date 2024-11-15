package m4s17.ejercicio2.model;

import java.util.List;

public class Login {
    private String username;
    private String password;
    private Usuario usuario;
    private boolean existe;

    public Login(String username, String password, Usuario usuario,boolean existe) {
        this.username = username;
        this.password = password;
        this.usuario = usuario;
        this.existe = existe;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setIdUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    @Override
    public String toString() {
        return "Login{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", usuario=" + usuario +
                ", existe=" + existe +
                '}';
    }

    public boolean buscarUsuarioId(int idUsuario) {
        /*if (idUsuario == this.idUsuario) {
            System.out.println("Usuario encontrado");
            return true;
        }
        System.out.println("Usuario no encontrado");
        return false;*/
        return usuario != null && usuario.getIdUsuario() == idUsuario;
    }

    public Prestamo buscarPrestamo(List<Prestamo> listaPrestamo) {
        for (Prestamo prestamo : listaPrestamo) {
            if (prestamo.getIdUsuario() == usuario.getIdUsuario()) {
                return prestamo;
            }
        }
        return null;
    }
}
