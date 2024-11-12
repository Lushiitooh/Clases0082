package m4s9.genericouno;

import java.util.ArrayList;
import java.util.List;

/*
Definir la Clase Genérica Producto<T>:

Esta clase contendrá un parámetro genérico T, y tendrá métodos para obtener
y mostrar el tipo del producto.

También puedes agregar métodos como mostrarDetalles()
para mostrar información específica de cada producto.

Crear Clases Específicas:

Define clases como Electronico, Alimento, y Ropa, que extiendan de Producto<T>.
Cada una tendrá sus propiedades específicas (por ejemplo, marca para
electrónicos, fecha de vencimiento para alimentos).

Crear Instancias de Productos y Añadir a la Lista:

En tu metodo main, crea instancias de Producto<Electronico>, Producto<Alimento>,
y Producto<Ropa>.

Añade estos objetos a una lista genérica que almacene Producto<?>.
Mostrar Información y Superclase:

Recorre la lista de productos y utiliza el metodo getClass() para mostrar la clase
del objeto.
Utiliza getClass().getSuperclass() para mostrar la superclase de cada producto.
Implementar el Metodo para Imprimir la Lista Completa:

Recorre la lista e imprime todos los detalles de cada producto.
 */
public class Main {
    public static void main(String[] args) {
        Producto<Integer> integerProducto = new Producto<>(1);
        integerProducto.mostrarDetalles();

        Producto<String> alimento1 = new Alimento("Churu","24-11-2024");
        Producto<String> alimento2 = new Alimento("MasterDog","24-11-2024");
        Producto<String> electronico1 = new Electronico("SmartTV","Samsung");
        Producto<String> electronico2 = new Electronico("Notebook","Lenovo");
        Producto<String> ropa1 = new Ropa("Camiseta","Negro");
        Producto<String> ropa2 = new Ropa("Gorra","Blanca");

        List<Producto<String>> listaProductos = new ArrayList<>();
        listaProductos.add(alimento1);
        listaProductos.add(alimento2);
        listaProductos.add(electronico1);
        listaProductos.add(electronico2);
        listaProductos.add(ropa1);
        listaProductos.add(ropa2);

        /*for(Producto<String> producto: listaProductos) {
            producto.mostrarDetalles();
            System.out.println("Clase: "+ producto.getClass().getName());
            System.out.println("Superclase: "+ producto.getClass().getSuperclass().getName());
            System.out.println();
        }*/

        for(Producto<String> producto: listaProductos) {
            producto.mostrarDetalles();
            //System.out.println("Clase: "+ producto.getClass().getName());
            //System.out.println("Superclase: "+ producto.getClass().getSuperclass().getName());
            System.out.println("-----------------------------");
        }

    }
}
