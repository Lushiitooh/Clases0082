package m4s18.ejercicio3.model;

public class Estudiante {
    private long id;
    private String nombre;
    private boolean inscrito;
    private double nota;

    public Estudiante(long id, String nombre, boolean inscrito, double nota) {
        this.id = id;
        this.nombre = nombre;
        this.inscrito = inscrito;
        this.nota= nota;
    }

    public Estudiante() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isInscrito() {
        return inscrito;
    }

    public void setInscrito(boolean inscrito) {
        this.inscrito = inscrito;
    }

    public double getNota(){
        return nota;
    }

    public void setNota(double nota){
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", inscrito=" + inscrito +
                '}';
    }
}
