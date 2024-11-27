package m4s19.ejercicio1.service.serviceimpl;

import m4s19.ejercicio1.model.Pedido;
import m4s19.ejercicio1.service.PedidoService;

public class PedidoServiceImpl implements PedidoService {
    @Override
    public double calcularTotalPreciosProductos(Pedido pedido) {
        return pedido.calcularTotalPreciosProductos();
    }

}
