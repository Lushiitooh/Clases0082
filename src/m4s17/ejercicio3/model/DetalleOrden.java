package m4s17.ejercicio3.model;

public class DetalleOrden {
    private Producto producto;
    private int cantidad;

    public DetalleOrden(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "DetalleOrden{" +
                "producto=" + producto +
                ", cantidad=" + cantidad +
                '}';
    }
}
