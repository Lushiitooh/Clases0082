package m4s18.ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        inventario.agregarProducto("Manzanas",10);
        inventario.agregarProducto("Mango",5);

        inventario.agregarProducto("Peras",10);

        System.out.println(inventario.obtenerCantidad("Manzanas"));

    }
}
