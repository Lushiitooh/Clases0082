package m4s17.ejercicio3;

import m4s17.ejercicio3.menus.SubMenuCategorias;
import m4s17.ejercicio3.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Categoria categoria1 = new Categoria("Cerveza");
        Producto producto1 = new Producto("Cross",7990.0,categoria1);
        DetalleOrden detalleOrden1 = new DetalleOrden(producto1,5);

        Direccion direccion1 = new Direccion("av. matta 3350","Santiago","7910000");
        Cliente cliente1 = new Cliente("Samuel","samuel@gmail.com",direccion1);
        Envio envio1 = new Envio(direccion1,"15-11-2024");

        MetodoPago metodo1 = new MetodoPago("Débito");

        List<DetalleOrden> detalleOrdenes = new ArrayList<>();
        detalleOrdenes.add(detalleOrden1);
        Orden orden = new Orden(cliente1, detalleOrdenes,metodo1,envio1);

        System.out.println("Cliente: " + orden.getCliente().getNombre());
        System.out.println("Correo: " + orden.getCliente().getCorreo());
        System.out.println("Direccion de envio: " + orden.getEnvio().getDireccion().getCalle()
                + ", " + orden.getEnvio().getDireccion().getCiudad()
                + ", " + orden.getEnvio().getDireccion().getCodigoPostal());
        System.out.println("Fecha del envio: " + orden.getEnvio().getFechaEnvio());
        System.out.println("Metodo de Pago: " + orden.getMetodoPago().getTipo());

        System.out.println("Detalles de la orden");
        for(DetalleOrden detalleLista : orden.getDetalles()){
            System.out.println("Producto : " + detalleLista.getProducto().getNombre()
            + ", $" + detalleLista.getProducto().getPrecio()
            + ", con una cantidad de: " + detalleLista.getCantidad());
        }


    }
}
