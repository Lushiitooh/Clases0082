package model;

public class Vino extends Producto{
    private String tipo; //tinto o blanco
    private String variedad; //merlot, sauvignon blanc

    public Vino(int idProducto, String nombreProducto, double precioProducto, int stock, String tipo, String variedad) {
        super(idProducto, nombreProducto, precioProducto, stock);
        this.tipo = tipo;
        this.variedad = variedad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    @Override
    public String getTipoProducto() {
        return "";
    }

    @Override
    public String toString() {
        return "Vino{" +
                "tipo='" + tipo + '\'' +
                ", variedad='" + variedad + '\'' +
                '}';
    }
}
