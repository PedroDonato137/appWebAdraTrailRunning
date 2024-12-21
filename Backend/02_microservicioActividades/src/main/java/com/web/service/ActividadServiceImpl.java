package com.web.service;

import com.web.model.Actividad;
import com.web.repository.ActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActividadServiceImpl implements ActividadService {

    @Autowired
    ActividadRepository actividadRepository;


    @Override
    public Actividad listarActividades(Integer idActividad) {
        return actividadRepository.findByIdActividad(idActividad);
    }
}
