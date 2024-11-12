package m4s10.ejercicioFacil;


import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private List<Producto> listaProductos = new ArrayList<>();

    //Metodo Agregar Productos a la lista
    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public int calcularTotalCompra(){
        int total = 0;
        for (Producto producto : listaProductos) {
            total += producto.getPrecio();
        }
        return total;
    }
}
