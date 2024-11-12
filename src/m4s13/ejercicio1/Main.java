package m4s13.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        nombres.add("Juan");//[0]
        nombres.add("Paolo");//[1]
        nombres.add("Eric");//[2]
        nombres.add("Francisco");
        nombres.add("Gabriela");
        nombres.add("Alex");
        nombres.add("Michelle");
        nombres.add("Jose");
        nombres.add("Paulo");//[8]
        nombres.add("Carolina");

        System.out.println("Lista de nombres: " + nombres);

        int tamano = nombres.size();
        System.out.println("Tamaño: "+ tamano);
       /* Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la posición que desea verificar: ");
            int indice = sc.nextInt();
            sc.nextLine();

            // Obtener el nombre por la posición en la que se encuentra dentro de la lista
            String nombrePosicion = nombres.get(indice);
            System.out.println("Posicion del nombre: " + nombrePosicion);*/

        //modificar nombre de la posición X
        nombres.set(6,"Carolina");
        System.out.println("Lista de nombres: " + nombres);

        nombres.set(2,"Fernando");
        System.out.println("Lista de nombres: " + nombres);

        //Eliminar un dato de la lista
        nombres.remove(2);
        nombres.remove("Carolina");
        System.out.println("Lista de nombres: " + nombres);

        //Comprobar información si existe Paulo
        boolean contenedor = nombres.contains("Paulo");
        System.out.println("Lo contiene?: "+contenedor);

        //Obtener el tamaño de la lista
        int tamano2 = nombres.size();
        System.out.println("Tamaño: "+ tamano2);
        System.out.println("Lista de nombres: " + nombres);

    }
}












