package m4s14.ejemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjemploFileNotFoundException {
    //FileNotFoundException
    public static void main(String[] args) {
        try{
            File archivo = new File("a.txt");
            Scanner leer = new Scanner(archivo);
            System.out.println("encontramos el archivo.");
        }catch(FileNotFoundException e){
            System.out.println("El archivo : "+ e.getMessage());
        }
    }
}
