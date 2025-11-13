package com.coderhouse.service;

import com.coderhouse.models.Curso;
import com.coderhouse.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> obtenerTodos() {
        return cursoRepository.findAll();
    }

    public Curso guardar(Curso curso) {
        return cursoRepository.save(curso);
    }

    public Curso obtenerPorId(Long id) {
        return cursoRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        cursoRepository.deleteById(id);
    }
}
