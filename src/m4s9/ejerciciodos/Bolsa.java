package m4s9.ejerciciodos;

import java.util.ArrayList;
import java.util.List;

public class Bolsa<T> {
    private List<T> items;
    private int capacidad;

    public Bolsa(int capacidad) {
        this.items = new ArrayList<>();
        this.capacidad = capacidad;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void agregarProducto(T item){
        if(items.size()< capacidad){
            items.add(item);
            System.out.println("Producto agregado exitosamente: "+ item);
        }else{
            System.out.println("La bolsa se encuentra llena. No puede ingresar mas productos.");
        }
    }

    public void mostrarProductos(){
        System.out.println("------ Productos en la bolsa ------");
        for(T item : items){
            System.out.println(item.toString());
        }
    }

}
