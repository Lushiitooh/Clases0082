package org.example;

import org.example.service.Service;

import static org.example.service.Service.*;

public class App {
    public static void main(String[] args) {
        Service service = new Service();
        //obtenerPostbyId(4);
        //comentariosPorId(1);
        obtenerTodosLosUsuarios();
    }
}

