package com.coderhouse.service;

import com.coderhouse.dto.InscripcionRequest;
import com.coderhouse.models.Alumno;
import com.coderhouse.models.Curso;
import com.coderhouse.models.Inscripcion;
import com.coderhouse.repository.AlumnoRepository;
import com.coderhouse.repository.CursoRepository;
import com.coderhouse.repository.InscripcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscripcionService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private InscripcionRepository inscripcionRepository;

    public Inscripcion crearInscripcion(InscripcionRequest request) {

        Alumno alumno = alumnoRepository.findById(request.getAlumnoId())
                .orElseThrow(() -> new RuntimeException("Alumno no encontrado"));

        List<Curso> cursos = cursoRepository.findAllById(request.getCursosIds());

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(alumno);
        inscripcion.setCursos(cursos);

        return inscripcionRepository.save(inscripcion);
    }
}
