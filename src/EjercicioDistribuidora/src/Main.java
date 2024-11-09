import model.*;
import utils.CarritoCompras;
import utils.Inventario;
import utils.Venta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Cliente cliente1 = new Cliente(1,"Luis","abc@gmail.com","56988551214","avenida siempre viva 123");
        Producto cerveza1 = new Cerveza(1,"Patagonia",800,1,"IPA");
        Producto vino1 = new Vino(1,"Bola 8", 3600,1,"Tinto","Merlot");
        Producto espumante1 = new Espumante(1,"Valdivieso",5000,1,"Moscato");
        inventario.agregarProducto(cerveza1);
        inventario.guardarProducto();
        inventario.agregarProducto(vino1);
        inventario.guardarProducto();
        inventario.agregarProducto(espumante1);
        inventario.guardarProducto();
        CarritoCompras carrito = new CarritoCompras(cliente1,inventario);
        carrito.agregarProducto("Patagonia",1);
        carrito.agregarProducto("Bola 8",3);
        Venta venta = new Venta(carrito,cliente1,"Reparto","Tarjeta");
        venta.registrarVenta();
        inventario.reducirStock(cerveza1.getNombreProducto(),1);
        inventario.guardarProducto();


    }
}
