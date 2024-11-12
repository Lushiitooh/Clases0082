package m4s9.ejercicio3;

import java.util.Objects;

public class Juguete {
    private String nombre;

    public Juguete(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Juguete: " +
                "nombre='" + nombre + '\'' ;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Juguete juguete = (Juguete) object;
        return nombre.equalsIgnoreCase(juguete.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }
}
