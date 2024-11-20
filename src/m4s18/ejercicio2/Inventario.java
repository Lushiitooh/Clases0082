package m4s18.ejercicio2;

import java.util.HashMap;
import java.util.Map;

public class Inventario {
    private final Map<String,Integer> inventario = new HashMap<>();

    public void agregarProducto(String nombre, int cantidad) {
        inventario.put(nombre, inventario.getOrDefault(nombre, 0) + cantidad);
    }

    public void retirarProducto(String nombre, int cantidad) {
        if(!inventario.containsKey(nombre) || inventario.get(nombre) < cantidad) {
            throw new IllegalArgumentException("El producto no existe o cantidad insuficiente");
        }
        inventario.put(nombre, inventario.get(nombre) - cantidad);
    }

    public int obtenerCantidad(String nombre) {
        return inventario.getOrDefault(nombre, 0);
    }
}
