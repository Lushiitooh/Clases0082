package m4s13.ejercicio2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NotasEstudiantes {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();

        notas.put("A", 70);
        notas.put("B", 65);
        notas.put("C", 40);
        notas.put("D", 20);
        notas.put("E", 35);
        notas.put("F", 56);
        notas.put("G", 43);
        notas.put("H", 30);

        //filtrar por notas aprobadas sobre o igual 40
        List<String> aprobados = notas.entrySet().stream()
                .filter(entry -> entry.getValue()>=40)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("estudiantes aprobados: " + aprobados);


    }
}
