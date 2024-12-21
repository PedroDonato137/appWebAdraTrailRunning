package com.web.service;


import com.web.model.UsuarioCarrera;
import com.web.repository.UsuarioCarreraRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioCarreraServiceImpl implements UsuarioCarreraService{


    @Autowired
    UsuarioCarreraRepository usuarioCarreraRepository;


    @Override
    public UsuarioCarrera guardarCarrera(Integer idUsuarioActividad, Integer posicionGeneral, Integer posicionCategoria, Integer puntosGeneral, Integer puntosCategoria) {

        try{
            UsuarioCarrera usuarioCarrera = new UsuarioCarrera(null, idUsuarioActividad, posicionGeneral, posicionCategoria, puntosGeneral, puntosCategoria);
            usuarioCarreraRepository.save(usuarioCarrera);
            return usuarioCarrera;
        }catch (Exception e){
            throw new RuntimeException("No se pudo guardar los datos de la carrera", e);
        }
    }
}
