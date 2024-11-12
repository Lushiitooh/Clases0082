package m4s13.ejercicio3.service;

import m4s13.ejercicio3.model.Pedido;
import m4s13.ejercicio3.model.Producto;

import java.util.*;

public class ClienteService {
    private Map<String, List<Pedido>> pedidosPorCliente;
    private Map<Integer, Producto> productos;

    public ClienteService() {
        pedidosPorCliente = new HashMap<>();
        productos = new HashMap<>();
        inicializarProductos();
    }

    public void inicializarProductos(){
        productos.put(1, new Producto(1,"Laptop"));
        productos.put(2, new Producto(2,"Tablet"));
        productos.put(3, new Producto(3,"Teléfono"));
        productos.put(4, new Producto(4,"Monitor"));
        productos.put(5, new Producto(5,"PC Escritorio"));


    }

    //metodo para agregar productos
    public void agregarPedido(String nombreCliente, Pedido pedido){
        pedidosPorCliente.computeIfAbsent(nombreCliente, k -> new ArrayList<>()).add(pedido);
    }

    //metodo pedidos por cliente
    public Map<String, List<Pedido>> obtenerPedidosPorCliente() {
        return pedidosPorCliente;
    }

    //metodo pedidos por id
    public Producto obtenerProductoPorId(int idProducto){
        return productos.get(idProducto);
    }

    //metodo ver productos de mayor cantidad
    public List<String> listarProductosCantidadMayorA(int cantidad){
        List<String> productosConCantidad = new ArrayList<>();
        pedidosPorCliente.forEach((nombreCliente, pedidos) -> {
            pedidos.stream().filter(pedido -> pedido.getCantidad() > cantidad)
                    .forEach(pedido -> productosConCantidad.add("Cliente: " + nombreCliente + ", Producto: "
                            + productos.get(pedido.getIdProductoPedido() + ", Cantidad " + pedido.getCantidad())));
        });
        return productosConCantidad;
    }

    //metodo para obtener el cliente con mas pedidos
    public String clienteConMasPedidos(){
        return pedidosPorCliente.entrySet().stream().max
                (Comparator.comparingInt(entry -> entry.getValue().stream()
                .mapToInt(Pedido::getCantidad).sum())).map(Map.Entry::getKey).orElse("N/A");
    }





}
