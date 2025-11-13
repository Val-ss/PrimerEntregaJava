package com.coderhouse.controller;

import com.coderhouse.models.Profesor;
import com.coderhouse.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profesores")
public class ProfesorController {

    @Autowired
    private ProfesorService profesorService;

    @GetMapping
    public List<Profesor> obtenerTodos() {
        return profesorService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Profesor obtenerPorId(@PathVariable Long id) {
        return profesorService.obtenerPorId(id);
    }

    @PostMapping
    public Profesor crear(@RequestBody Profesor profesor) {
        return profesorService.guardar(profesor);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        profesorService.eliminar(id);
    }
}
