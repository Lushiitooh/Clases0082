package m4s12.eliminararchivos;

import java.io.File;

public class EliminarArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "archivo creado2.xlsx";
        File archivo = new File(nombreArchivo);


        if(archivo.exists()){
            if(archivo.delete()){
                System.out.println("el archivo se eliminado");
            }else{
                System.out.println("no se puede eliminar el archivo");
            }

        }else{
            System.out.println("Archivo no encontrado");
        }
    }
    }

