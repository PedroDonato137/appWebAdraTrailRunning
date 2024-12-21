package com.web.service;

import com.web.model.Actividad;
import com.web.model.UsuarioActividad;
import com.web.model.UsuarioCarrera;
import com.web.repository.UsuarioActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioActividadServiceImpl implements UsuarioActividadService{

    @Autowired
    UsuarioActividadRepository usuarioActividadRepository;


    @Override
    public List<UsuarioActividad> listarActividadesUsuario(Integer idUsuario) {
        return usuarioActividadRepository.findByIdUsuario(idUsuario);
    }
/*
    @Override
    public Actividad guardarActividad(Integer idUsuario, Integer idActividad) {
        return null;
    }

    @Override
    public UsuarioCarrera guardarCarrera(Integer idUsuarioActiviadad) {
        return null;
    }*/
}
