package m4s9.genericouno;

public class Producto<T> {
    private T producto; //Cantidad int = 5 String = Cinco

    public Producto(T producto) {
        this.producto = producto;
    }

    public T getProducto() {
        return producto;
    }

    public void setProducto(T producto) {
        this.producto = producto;
    }

    public void mostrarDetalles(){
    }
}
