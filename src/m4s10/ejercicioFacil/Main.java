package m4s10.ejercicioFacil;

import java.util.ArrayList;
import java.util.List;

/*
Implementando SRP y KISS
Crea una clase Producto que tenga los atributos nombre (String) y precio (double).
Luego, crea una clase CarritoDeCompras que pueda agregar productos
y calcular el total de la compra.

Implementa la funcionalidad de manera sencilla y asegúrate de que cada clase cumpla
una única responsabilidad (SRP). Mantén el código simple (KISS).
 */
public class Main {
    public static void main(String[] args) {
        //Crear Productos
        Producto producto1 = new Producto("Algo", 4990);
        Producto producto2 = new Producto("Shampoo", 3990);

        //Crear carrito de compras y agregar los productos
        CarritoDeCompras carrito = new CarritoDeCompras();
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);

        System.out.println(carrito.calcularTotalCompra());

    }

}
