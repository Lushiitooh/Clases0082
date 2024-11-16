package m4s17.ejercicio3;

import m4s17.ejercicio3.model.Cliente;
import m4s17.ejercicio3.model.DetalleOrden;
import m4s17.ejercicio3.model.Envio;
import m4s17.ejercicio3.model.MetodoPago;

import java.util.List;

public class Orden {
    private Cliente cliente;
    private List<DetalleOrden> detalles;
    private MetodoPago metodoPago;
    private Envio envio;

    public Orden(Cliente cliente, List<DetalleOrden> detalles, MetodoPago metodoPago, Envio envio) {
        this.cliente = cliente;
        this.detalles = detalles;
        this.metodoPago = metodoPago;
        this.envio = envio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<DetalleOrden> getDetalles() {
        return detalles;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public Envio getEnvio() {
        return envio;
    }
}
