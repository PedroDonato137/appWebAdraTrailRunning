package com.web.service;

import com.web.model.Usuario;

public interface UsuarioService {

    Usuario autenticarUsuario(String correo, String password); // Metodo para logear
    boolean registrarUsuario(Usuario usuario); // Metodo para comprobar que existe el usuario
}
