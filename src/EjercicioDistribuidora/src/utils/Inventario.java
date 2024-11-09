package utils;

import model.Producto;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Inventario {
    private Map<String, Producto> productos = new HashMap<>();

    public void agregarProducto(Producto producto) {
        productos.put(producto.getNombreProducto(), producto);
    }

    public Producto obtenerProducto(String nombreProducto) {
        return productos.get(nombreProducto);
    }

    public void guardarProducto() {
        try(PrintWriter writer = new PrintWriter(new FileWriter("inventario.txt"))) {
            for(Producto producto : productos.values()) {
                writer.println(producto);
                System.out.println("se guardo producto " + producto.getNombreProducto());
            }
        }catch (Exception e) {
            System.out.println("Error al guardar el producto" + e.getMessage());
        }
    }
        public boolean reducirStock(String nombre, int cantidad) {
        Producto producto = productos.get(nombre);
        if(producto != null && producto.getStock() >= cantidad) {
            return true;
        }else{
            System.out.println("No hay suficiente Stock");
            return false;
        }

    }
}
