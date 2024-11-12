package m4s13.ejercicio2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Map y HashMap
        Map<Integer,String> nombreProducto = new HashMap<>();

        //para añadir se ocupa un PUT (minuscula)
        nombreProducto.put(1, "Notebook");
        nombreProducto.put(2, "Televisores");
        nombreProducto.put(3, "Celulares");
        nombreProducto.put(4, "Computer Science");
        nombreProducto.put(5, "Electronics");

        System.out.println(nombreProducto);
        //filtrar productos por ID con STREAM
        List<String> productoFiltrado = nombreProducto.entrySet().stream()//EntrySet().stream() transforma la entrada de HASHMAP en flujos de datos (stream).
                .filter(entry -> entry.getKey() > 2)//filter es filtrado(parametro de hashmap y nos devuelve el dato KEY y le generamos sentencia
                .map(Map.Entry::getValue)//cambia la entrada de Clave/Valor al valor ignorando la clave(KEY)
                .collect(Collectors.toList());// recolecta los nombres filtrados en una lista.

        System.out.println("todos los productos que tengan Key mayor a 2: " + productoFiltrado);

        Map<Integer, String> nombresMayusculas = nombreProducto.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().toLowerCase()));

        //EntrySet().stream() transforma la entrada de HASHMAP en flujos de datos (stream).
        List<String> nombreMayusculaLista = nombresMayusculas.values().stream()
                .toList();
        System.out.println(nombreMayusculaLista);

        double promedioCaracteres = nombreProducto.values().stream()
                .mapToInt(String::length)//convertir a longitud de los nombres
                .average()// para calcular promedio
                .orElse(0.0);//valor por defecto si esta vacia la lista
        System.out.println(promedioCaracteres);






    }
}
