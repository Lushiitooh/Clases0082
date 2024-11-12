package m4s13.ejercicio3.model;

public class Pedido {
    private int idProductoPedido;
    private int cantidad;

    public Pedido(int idProductoPedido, int cantidad) {
        this.idProductoPedido = idProductoPedido;
        this.cantidad = cantidad;
    }

    public int getIdProductoPedido() {
        return idProductoPedido;
    }

    public void setIdProductoPedido(int idProductoPedido) {
        this.idProductoPedido = idProductoPedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "idProductoPedido=" + idProductoPedido +
                ", cantidad=" + cantidad +
                '}';
    }
}
