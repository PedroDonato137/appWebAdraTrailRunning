package com.web.repository;

import com.web.model.UsuarioActividad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioActividadRepository extends JpaRepository<UsuarioActividad, Integer> {
    List<UsuarioActividad> findByIdUsuario(Integer idUsuario);
}
