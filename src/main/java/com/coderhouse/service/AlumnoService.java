package com.coderhouse.service;

import com.coderhouse.models.Alumno;
import com.coderhouse.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    public List<Alumno> obtenerTodos() {
        return alumnoRepository.findAll();
    }

    public Alumno guardar(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    public Alumno obtenerPorId(Long id) {
        return alumnoRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        alumnoRepository.deleteById(id);
    }
}
