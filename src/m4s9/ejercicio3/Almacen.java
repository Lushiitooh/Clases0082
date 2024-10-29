package m4s9.ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Almacen<T> {
    private List<T> lista;

    public Almacen() {
        lista = new ArrayList<>();
    }

    public void agregarItem(T item) {
        lista.add(item);
        System.out.println("El item se ha agregado en el almacen correctamente");
        System.out.println(item);
    }

    public void eliminarItem(T item) {
        if (lista.contains(item)) {
            lista.remove(item);
            System.out.println("El item se ha eliminado en el almacen correctamente");
        } else {
            System.out.println("El item no se encuentra en la lista");
        }
    }

    public void mostrarItems() {
        System.out.println("Elementos de la lista: ");
        for (T item : lista) {
            System.out.println(item);
            System.out.println("------------------------");
        }
    }

    protected T crearElemento(String nombre) {
        return null;
    }

    public void gestionarAlmacen(Scanner sc, String tipoElemento) {
        int opcion;
        do {
            System.out.println("\n ---- Gestionando " + tipoElemento.toUpperCase() + "----");
            System.out.println("1.- Agregar " + tipoElemento);
            System.out.println("2.- Eliminar " + tipoElemento);
            System.out.println("3.- Mostrar " + tipoElemento);
            System.out.println("4.- Volver al menú principal");
            System.out.println("Elige una opcion");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del " + tipoElemento + " a agregar");
                    String nombreAgregar = sc.nextLine();
                    T nuevoItem = crearElemento(nombreAgregar);
                    if (nuevoItem != null) {
                        agregarItem(nuevoItem);
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del " + tipoElemento + " a eliminar");
                    String nombreEliminar = sc.nextLine();
                    T eliminarItem = crearElemento(nombreEliminar);
                    if (eliminarItem != null) {
                        eliminarItem(eliminarItem);
                    }
                    break;
                case 3:
                    mostrarItems();
                    break;
                case 4:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 4) ;
    }


}
