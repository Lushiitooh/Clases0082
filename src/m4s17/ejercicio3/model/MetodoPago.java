package m4s17.ejercicio3.model;

public class MetodoPago {
    private String tipo;

    public MetodoPago(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "MetodoPago{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
