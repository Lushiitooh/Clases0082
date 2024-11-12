package m4s10.impresora;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione el tipo de impresora que desea ocupar");
        System.out.println("1. Impresora laser");
        System.out.println("2. Impresora Multifuncional");
        System.out.println("3. Impresora 3D");
        System.out.println("Favor escoger una opcion: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        IImpresora impresora;

        if (opcion == 1) {
            impresora = new ImpresoraLaser();
        }else if (opcion == 2) {
            impresora = new ImpresoraMultifuncional();
        }else if (opcion == 3) {
            impresora = new Impresora3D();
        }else{
            System.out.println("La opcion no es valida. se utilizara impresora laser.");
            impresora = new ImpresoraLaser();
        }

        Documento documento = new Documento(impresora);

        System.out.println("Ingrese el contenido del documento: ");
        String contenido = sc.nextLine();

        documento.imprimirDocumento(contenido);

        sc.close();


    }
}
