package m4s13.ejercicio3.util;

import m4s13.ejercicio3.model.Pedido;

import java.util.List;

public class PedidoUtils {
    public static int calcularTotalProductos(List<Pedido> pedidos){
        return pedidos.stream().mapToInt(Pedido::getCantidad).sum();
    }
}
