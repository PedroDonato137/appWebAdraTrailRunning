package com.web.service;

import com.web.model.UsuarioActividad;
import com.web.repository.UsuarioActividadRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UsuarioActividadServiceImpl implements UsuarioActividadService{

    @Autowired
    UsuarioActividadRepository usuarioActividadRepository;


    @Override
    public List<UsuarioActividad> listarActividadesUsuario(Integer idUsuario) {
        return usuarioActividadRepository.findByIdUsuario(idUsuario);
    }

    @Override
    public UsuarioActividad guardarActividadUsuario(Integer idUsuario, Integer idActividad, String urlStrava) {

        if (idUsuario == null || idActividad == null || urlStrava == null || urlStrava.isEmpty()) {
            throw new IllegalArgumentException("Los parámetros idUsuario, idActividad y urlStrava no pueden ser nulos o vacíos");
        }

        if (!usuarioActividadRepository.existsById(idUsuario)) {
            throw new EntityNotFoundException("El usuario con id " + idUsuario + " no existe");
        }

        if (!usuarioActividadRepository.existsById(idActividad)) {
            throw new EntityNotFoundException("La actividad con id " + idActividad + " no existe");
        }
        try {
            LocalDate fechaActual = LocalDate.now(); // Obtener el año actual
            UsuarioActividad usuarioActividad = new UsuarioActividad(null, idUsuario, idActividad, fechaActual.getYear(), urlStrava);
            usuarioActividadRepository.save(usuarioActividad);
            return usuarioActividad;
        }catch (Exception e){
            throw new RuntimeException("No se pudo guardar la actividad del usuario", e);
        }
    }

}
