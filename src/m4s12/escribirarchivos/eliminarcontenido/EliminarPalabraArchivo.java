package m4s12.escribirarchivos.eliminarcontenido;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;

public class EliminarPalabraArchivo {

    public static void eliminarPalabraArchivo(String nombreArchivo, String palabraAEliminar) {
        StringBuilder contenido = new StringBuilder();

        try{
            BufferedReader leer = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            while ((linea = leer.readLine()) != null) {
                //linea = linea.replace(palabraAEliminar, "");
                linea = linea.replaceAll("\\b\\s*" + palabraAEliminar + "\\s*\\b","");
                if(!linea.isEmpty()){
                    contenido.append(linea).append("\n");
                }
            }
            leer.close();
        }catch (Exception e){
            System.out.println("no se puede leer el archivo "+e.getMessage());
            return;

        }
        try(FileWriter escribirArchivo = new FileWriter(nombreArchivo)){
            escribirArchivo.write(contenido.toString());
            System.out.println("Palabra eliminada con exito");
        }catch (Exception e){
            System.out.println("no se puede sobreescribir el archivo "+e.getMessage());
        }

    }
}

