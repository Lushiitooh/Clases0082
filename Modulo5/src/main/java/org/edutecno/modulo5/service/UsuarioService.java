package org.edutecno.modulo5.service;

import org.edutecno.modulo5.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
    private static final List<Usuario> usuarios = new ArrayList<>();

    //registrar usuarios
    public static void registrarUsuario(String usuario, String password){
        usuarios.add(new Usuario(usuario,password));
    }

    //validarlo
    public static Usuario validarUsuario(String usuario, String password){
        for (Usuario listaUsuarioEncontrado : usuarios){
            if(listaUsuarioEncontrado.getUsuario().equals(usuario) && listaUsuarioEncontrado.getPassword().equals(password)){
                return listaUsuarioEncontrado;
            }

        }
        return null;
    }
}
