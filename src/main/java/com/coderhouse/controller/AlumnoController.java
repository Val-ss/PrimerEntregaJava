package com.coderhouse.controller;

import com.coderhouse.models.Alumno;
import com.coderhouse.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping
    public List<Alumno> obtenerTodos() {
        return alumnoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Alumno obtenerPorId(@PathVariable Long id) {
        return alumnoService.obtenerPorId(id);
    }

    @PostMapping
    public Alumno crear(@RequestBody Alumno alumno) {
        return alumnoService.guardar(alumno);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        alumnoService.eliminar(id);
    }
}
