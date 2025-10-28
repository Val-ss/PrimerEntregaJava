package com.coderhouse;

import com.coderhouse.models.Alumno;
import com.coderhouse.models.Curso;
import com.coderhouse.models.Profesor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Profesor prof1 = new Profesor("Juan", "Pérez", "MAT101");
        Profesor prof2 = new Profesor("Ana", "Gómez", "FIS202");

        Curso curso1 = new Curso("Matemática", "MAT101");
        Curso curso2 = new Curso("Física", "FIS202");

        curso1.setProfesor(prof1);
        curso2.setProfesor(prof2);

        Alumno alumno1 = new Alumno("Luis", "Fernández", 12345678, "L001", 20);
        Alumno alumno2 = new Alumno("María", "García", 87654321, "L002", 22);

        curso1.getAlumnos().add(alumno1);
        curso1.getAlumnos().add(alumno2);
        curso2.getAlumnos().add(alumno2);

        alumno1.getCursos().add(curso1);
        alumno2.getCursos().add(curso1);
        alumno2.getCursos().add(curso2);

        List<Curso> cursos = List.of(curso1, curso2);
        for (Curso c : cursos) {
            System.out.println("Curso: " + c.getNombre() + " - Profesor: " + c.getProfesor().getNombre());
            System.out.println("Alumnos inscritos:");
            for (Alumno a : c.getAlumnos()) {
                System.out.println(" - " + a.getNombre() + " " + a.getApellido());
            }
            System.out.println("-----");
        }
    }
}
