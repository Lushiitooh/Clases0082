package m4s13.ejercicio3;

import m4s13.ejercicio3.model.Pedido;
import m4s13.ejercicio3.service.ClienteService;
import m4s13.ejercicio3.util.PedidoUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ClienteService clienteService = new ClienteService();
        List<String> clientes = Arrays.asList("Luis","Maria", "Juanito", "Pedro", "Ricardo" );
        Random random = new Random();

        for (String cliente : clientes) {
            int numeroPedidos = random.nextInt(5)+1;
            for (int i = 0; i < numeroPedidos; i++) {
                int idProducto = random.nextInt(5)+1;
                int cantidad = random.nextInt(5)+1;
                clienteService.agregarPedido(cliente,new Pedido(idProducto,cantidad));
            }
        }

        //imprimir pedidos por cliente
        System.out.println("Pedidos realizados por cada cliente: ");
        clienteService.obtenerPedidosPorCliente()
            .forEach((nombreCliente,pedidos)->{
            System.out.println("Cliente: " + nombreCliente);
            pedidos.forEach(pedido ->
            System.out.println("Producto: " + clienteService.obtenerProductoPorId
            (pedido.getIdProductoPedido()).getNombre() + " Cantidad: " + pedido.getCantidad()));
            System.out.println("---------------------------------");
        });

        //Total productos pedidos por cliente
        System.out.println("Pedidos realizados por cada cliente: ");
        clienteService.obtenerPedidosPorCliente()
        .forEach((nombreCliente,pedidos)->{
            int totalProductos = PedidoUtils.calcularTotalProductos(pedidos);
            System.out.println("Cliente: " + nombreCliente + ", Total de productos: " + totalProductos);
            System.out.println("---------------------------");

        });

        /*//listar productos mayor a ?
        System.out.println("\n Pedidos con una cantidad mayor a 5 de un mismo producto: ");
        clienteService.listarProductosCantidadMayorA(2).forEach(System.out::println);*/

        //cliente con mas pedidos
        System.out.println("Cliente con mas pedidos: " + clienteService.clienteConMasPedidos());

    }
}
