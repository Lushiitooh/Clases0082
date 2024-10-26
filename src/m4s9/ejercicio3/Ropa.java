package m4s9.ejercicio3;

import java.util.Objects;

public class Ropa {
    private String tipo;

    public Ropa (String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Ropa{" +
                "tipo='" + tipo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Ropa ropa = (Ropa) object;
        return tipo.equalsIgnoreCase(ropa.tipo);
    }

    @Override
    public int hashCode() {
        return tipo.hashCode();
    }
}
