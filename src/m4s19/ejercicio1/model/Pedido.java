package m4s19.ejercicio1.model;

import java.util.List;

public class Pedido {
    private List<Producto> productos;

    public Pedido(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public double calcularTotalPreciosProductos(){
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }

}
