package com.web.service;

import com.web.model.Usuario;
import com.web.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Usuario autenticarUsuario(String correo, String password) {
        return usuarioRepository.findByCorreoAndPassword(correo, password);
    }

    @Override
    public boolean registrarUsuario(Usuario usuario) {
        if(usuarioRepository.findById(usuario.getIdUsuario()).isPresent()){
            return false;
        }
        usuarioRepository.save(usuario);
        return true;
    }
}
