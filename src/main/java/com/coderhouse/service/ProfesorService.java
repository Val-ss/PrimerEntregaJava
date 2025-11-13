package com.coderhouse.service;

import com.coderhouse.models.Profesor;
import com.coderhouse.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorService {

    @Autowired
    private ProfesorRepository profesorRepository;

    public List<Profesor> obtenerTodos() {
        return profesorRepository.findAll();
    }

    public Profesor guardar(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    public Profesor obtenerPorId(Long id) {
        return profesorRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        profesorRepository.deleteById(id);
    }
}
