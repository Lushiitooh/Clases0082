package m4s9.ejercicio3;

import java.util.Objects;

public class Libro {
    public String titulo;

    public Libro (String titulo) {
        this.titulo = titulo;
    }

     public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Libro de " +
                "titulo= '" + titulo + '\'' ;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Libro libro = (Libro) object;
        return titulo.equalsIgnoreCase(libro.titulo);
    }

    @Override
    public int hashCode() {
        return titulo.hashCode();
    }
}
