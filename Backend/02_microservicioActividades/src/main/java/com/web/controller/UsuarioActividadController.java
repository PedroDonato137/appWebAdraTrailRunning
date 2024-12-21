package com.web.controller;


import com.web.model.Actividad;
import com.web.model.UsuarioActividad;
import com.web.service.ActividadService;
import com.web.service.UsuarioActividadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class UsuarioActividadController {

    @Autowired
    UsuarioActividadService usuarioActividadService;

    @Autowired
    ActividadService actividadService;

    @GetMapping(value = "/listado", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UsuarioActividad>> listarActividadesUsuario (@RequestParam("idUsuario") Integer idUsuario){
        return new ResponseEntity<>(usuarioActividadService.listarActividadesUsuario(idUsuario), HttpStatus.OK);
    }

    @GetMapping(value = "/actividad", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Actividad> listarActividades (@RequestParam("idActividad") Integer idActividad){
        return new ResponseEntity<>(actividadService.listarActividades(idActividad), HttpStatus.OK);
    }

    @PostMapping(value = "/actividadUsuario", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> guardarActividadUsuario(@RequestParam("idUsuario") Integer idUsuario, @RequestParam("idActividad") Integer idActividad, @RequestParam("urlStrava") String urlStrava){
        UsuarioActividad usuarioActividad = usuarioActividadService.guardarActividadUsuario(idUsuario, idActividad, urlStrava);
        if(usuarioActividad != null){
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.SERVICE_UNAVAILABLE);
        }
    }
}
