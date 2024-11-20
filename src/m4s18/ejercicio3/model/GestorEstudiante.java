package m4s18.ejercicio3.model;

import java.util.ArrayList;
import java.util.List;

public class GestorEstudiante {
    private List<Estudiante> estudiantes = new ArrayList<>();

    //Agregar Estudiantes a la lista
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    //Buscar a todos los estudiantes
    public List<Estudiante> obtenerEstudiantes() {
        return estudiantes;
    }

    //Buscar estudiante por ID 10
    public Estudiante buscarEstudiante(long id){
        for(Estudiante estudiante : estudiantes){
            if(estudiante.getId() == id) //.equals(id)
                return estudiante;
        }
        return null;
    }

    //vertificar si se encuentra inscrito
    public boolean estaInscrito(long id){
         Estudiante estudiante = buscarEstudiante(id);
         return estudiante != null && estudiante.isInscrito();
        }


    public void actualizarNota(long id,double nuevaNota){
        Estudiante estudiante = buscarEstudiante(id);
        if(estudiante != null){
            estudiante.setNota(nuevaNota);
        }else{
            throw new IllegalArgumentException("Estudiante no encontrado");
        }


    }
}







