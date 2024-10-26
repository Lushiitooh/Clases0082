package m4s9.ejercicio3;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
Requisitos del Ejercicio:
Clases Específicas de Productos:

Crear tres clases específicas que representen los tipos de productos que se almacenarán:
Libro: Cada libro tendrá un "título".
Juguete: Cada juguete tendrá un "nombre".
Ropa: Cada prenda de ropa tendrá un "tipo" (por ejemplo, "Camisa", "Pantalón").
Sobrescribir los métodos toString, equals y hashCode para cada clase para permitir comparaciones
adecuadas y una representación clara de los objetos.

Clase Genérica Almacen<T>:

Implementar una clase genérica Almacen<T> que se encargue de manejar una lista de objetos de
tipo genérico T.
La clase debe incluir métodos para:
agregar(T item): Agregar un producto al almacén.
eliminar(T item): Eliminar un producto del almacén si existe.
mostrar(): Mostrar todos los productos en el almacén.

Subclases Específicas de Almacen:

Crear tres subclases de Almacen para gestionar los diferentes tipos de productos:
AlmacenLibros: Manejará objetos de tipo Libro.
AlmacenJuguetes: Manejará objetos de tipo Juguete.
AlmacenRopa: Manejará objetos de tipo Ropa.
Cada subclase debe sobrescribir un metodo crearElemento(String nombre) que permitirá crear el
tipo específico de objeto para agregarlo al almacén.

Interfaz Interactiva en el Main:

Implementar un menú interactivo en el Main que permita al usuario elegir qué tipo de
productos gestionar:
Opción 1: Gestionar Libros
Opción 2: Gestionar Juguetes
Opción 3: Gestionar Ropa
Opción 4: Salir del programa

Cuando el usuario elija un tipo de producto para gestionar, el programa debe mostrar
un submenú que le permita:
Agregar un producto al almacén solicitando el nombre del producto.
Eliminar un producto del almacén solicitando el nombre del producto.
Mostrar todos los productos que se encuentran actualmente en el almacén.
Volver al menú principal.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Instanciar almacenes especificos de cada tipo
        AlmacenarLibros almacenarLibros = new AlmacenarLibros();
        AlmacenarJuguete almacenarJuguete = new AlmacenarJuguete();
        AlmacenarRopa almacenarRopa = new AlmacenarRopa();

        int opcion;
        do{
            System.out.println("=== MENÚ DE ALMACÉN ===");
            System.out.println("1.- Gestionar Libros");
            System.out.println("2.- Gestionar Juguetes");
            System.out.println("3.- Gestionar Ropa");
            System.out.println("4.- Salir");
            System.out.println("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion){
                case 1:
                    almacenarLibros.gestionarAlmacen(sc, "Libro");
                    break;
                case 2:
                    almacenarJuguete.gestionarAlmacen(sc, "Juguete");
                    break;
                case 3:
                    almacenarRopa.gestionarAlmacen(sc, "Ropa");
                    break;
                case 4:

                    break;
                    default:
                        System.out.println("Opcion no , favor intentar nuevamente");


            }

        }while (opcion != 4);

    }

}
