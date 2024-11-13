package utils;

import model.Cliente;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Venta {
    private CarritoCompras carrito;
    private Cliente cliente;
    private String tipoEntrega;
    private String tipoPago;
    final private int  costoEnvio = 3000;

    public Venta(CarritoCompras carrito, Cliente cliente, String tipoEntrega, String tipoPago) {
        this.carrito = carrito;
        this.cliente = cliente;
        this.tipoEntrega = tipoEntrega;
        this.tipoPago = tipoPago;
    }

    public double calcularTotalConEnvio(){
        double total = carrito.obtenerTotal();
        if(tipoEntrega.equalsIgnoreCase("Reparto")){
            total += costoEnvio;
        }
        return total;
    }

    public void registrarVenta(){
        try(PrintWriter writer = new PrintWriter(new FileWriter("venta.txt", true))) {
            writer.println("Cliente: "+ cliente);
            writer.println("Tipo de entrega: "+ tipoEntrega);
            writer.println("Tipo de pago: "+ tipoPago);
            writer.println("Total: "+ calcularTotalConEnvio());
            writer.println("---------------------------");
        }catch (IOException e){
            System.out.println("error al registrar la venta: "+ e.getMessage());
        }
    }


}
