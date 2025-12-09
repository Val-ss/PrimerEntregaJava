package com.coderhouse.controller;

import com.coderhouse.dto.InscripcionRequest;
import com.coderhouse.models.Inscripcion;
import com.coderhouse.service.InscripcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inscripciones")
public class InscripcionController {

    @Autowired
    private InscripcionService inscripcionService;

    @PostMapping
    public Inscripcion crear(@RequestBody InscripcionRequest request) {
        return inscripcionService.crearInscripcion(request);
    }
}
