package com.web.repository;

import com.web.model.Actividad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActividadRepository extends JpaRepository<Actividad, Integer> {
    Actividad findByIdActividad(Integer idActividad);
}
