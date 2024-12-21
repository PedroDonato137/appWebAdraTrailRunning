package com.web.service;

import com.web.model.UsuarioCarrera;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioCarreraService {
    UsuarioCarrera guardarCarrera (Integer idUsuarioActividad, Integer posicionGeneral, Integer posicionCategoria, Integer puntosGeneral, Integer puntosCategoria);
}
