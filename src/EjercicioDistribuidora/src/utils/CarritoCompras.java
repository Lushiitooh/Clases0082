package utils;

import model.Cliente;
import model.Producto;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {
    private Cliente cliente;
    private Inventario inventario;
    private List<Producto> productos;
    private double total;


    public CarritoCompras(Cliente cliente, Inventario inventario) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.total = 0.0;
        this.inventario = inventario;
    }

    public void agregarProducto(String nombreProducto, int cantidad) {
    Producto producto = inventario.obtenerProducto(nombreProducto);
    if(producto != null && inventario.reducirStock(nombreProducto, cantidad)) {
        for (int i = 0; i < cantidad; i++) {
            productos.add(producto);
            total += producto.getPrecioProducto();
        }
    }else{
        System.out.println("no se pudo agregar a la lista " + nombreProducto + " al Carrito");
    }
    }

    public double obtenerTotal() {
        if(productos.size() >= 5){
            return total * 0.9;
        }
        return total;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
