package model;

public class Espumante extends Producto{
    private String tipo;

    public Espumante(int idProducto, String nombreProducto, double precioProducto, int stock, String tipo) {
        super(idProducto, nombreProducto, precioProducto, stock);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getTipoProducto() {
        return "";
    }
}
