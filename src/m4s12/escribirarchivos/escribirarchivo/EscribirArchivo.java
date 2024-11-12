package m4s12.escribirarchivos.escribirarchivo;

import java.io.FileWriter;
import java.io.PrintWriter;

public class EscribirArchivo {
        //FileWriter y PrintWriter
    public static void escribirArchivo(String nombreArchivo, String texto) {
        try{
            FileWriter escribirArchivoNombre = new FileWriter(nombreArchivo,true); // true sirve para añadir al final del documento sin sobreescribir
            PrintWriter escribirDentrodelArchivo = new PrintWriter(escribirArchivoNombre);
            escribirDentrodelArchivo.println(texto);
            escribirDentrodelArchivo.close();
            escribirArchivoNombre.close();
            System.out.println("Se escribio con exito");
        } catch (Exception e) {
            System.out.println("error al escribir"+e.getMessage());
        }
    }
}
