package m4s12.leerarchivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerArchivo {
    public void archivo() {
        try{ // Con WHILE
            FileReader leerArchivo = new FileReader("archivo creado2.txt");
            BufferedReader leer = new BufferedReader(leerArchivo);
            String linea;
            System.out.println("\n----- Contenido del archivo -----");
            while ((linea = leer.readLine()) != null) {
                System.out.println(linea);
                System.out.println("--------------------------");
            }
            leer.close();
            leerArchivo.close();

        } catch (Exception e) {
            System.out.println("error al leer el archivo" + e.getMessage());
        }


        /*try{ // Con FOR (recordar asignarle el tipo de dato para el nombre del archivo en el metodo.)
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
            String linea;
            for (String linea : lineas) {
                System.out.println(linea);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }*/

    }
}
