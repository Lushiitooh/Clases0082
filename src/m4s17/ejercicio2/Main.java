package m4s17.ejercicio2;

import m4s17.ejercicio2.model.Libro;

import m4s17.ejercicio2.model.Login;
import m4s17.ejercicio2.model.Prestamo;
import m4s17.ejercicio2.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(1,"luis","182426214","luis.s@gmail.com");
        Libro libro = new Libro("loquesea","loqueaAutor","Terror");
        Prestamo prestamo = new Prestamo(1,libro,"14-11-2024",5000);

        List<Prestamo> prestamos = new ArrayList<>();
        prestamos.add(prestamo);

        Login login = new Login("luis123","luis321",usuario,true);

        Prestamo prestamoEncontrado = login.buscarPrestamo(prestamos);
        if(prestamoEncontrado != null){
            System.out.println(prestamoEncontrado);
        }else{
            System.out.println("sin prestamos");
        }
    }
}
