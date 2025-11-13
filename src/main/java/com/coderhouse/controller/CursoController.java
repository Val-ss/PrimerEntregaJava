package com.coderhouse.controller;

import com.coderhouse.models.Curso;
import com.coderhouse.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping
    public List<Curso> obtenerTodos() {
        return cursoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Curso obtenerPorId(@PathVariable Long id) {
        return cursoService.obtenerPorId(id);
    }

    @PostMapping
    public Curso crear(@RequestBody Curso curso) {
        return cursoService.guardar(curso);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        cursoService.eliminar(id);
    }
}
