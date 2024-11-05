package m4s12.creararchivos;

import java.io.File;
import java.io.IOException;

public class CrearArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "archivo creado2.txt"; // Nombre que contendra el archivo
        File archivo = new File(nombreArchivo); // creamos una instancia de FILE

        try{
            if(archivo.createNewFile()){ //createNewFile es un metodo que intenta crear el archivo, si existe devuelve false
                System.out.println("El archivo se ha creado con exito");
            }else{
                System.out.println("El archivo ya existe");
            }
        }catch(IOException mensaje){ //captura el error dentro del try
            System.out.println("Ocurrio un error al crear el archivo" + mensaje.getMessage());
        }
    }
}
