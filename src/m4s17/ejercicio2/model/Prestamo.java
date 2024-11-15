package m4s17.ejercicio2.model;



public class Prestamo {
    private int idUsuario;
    private Libro libro;
    private String fechaPrestamo;
    private int creditoUsuario;

    public Prestamo(int idUsuario, Libro libro, String fechaPrestamo, int creditoUsuario) {
        this.idUsuario = idUsuario;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.creditoUsuario = creditoUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public int getCreditoUsuario() {
        return creditoUsuario;
    }

    public void setCreditoUsuario(int creditoUsuario) {
        this.creditoUsuario = creditoUsuario;
    }

    @Override
    public String toString() {
        return "Prestamo: " +
                "El id del usuario es = " + idUsuario +
                ", libro=" + libro +
                ", la fecha del prestamo es " + fechaPrestamo + '\'' +
                ", el credito que tiene el usuario es de = " + creditoUsuario;
    }


}
