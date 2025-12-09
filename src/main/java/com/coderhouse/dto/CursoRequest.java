package com.coderhouse.dto;

import java.util.List;

public class CursoRequest {

    private CursoData curso;
    private ProfesorData profesor;
    private List<AlumnoData> alumnos;

    public static class CursoData {
        private String nombre;
        private String codigo;

        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }

        public String getCodigo() { return codigo; }
        public void setCodigo(String codigo) { this.codigo = codigo; }
    }

    public static class ProfesorData {
        private Long id;

        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
    }

    public static class AlumnoData {
        private Long id;

        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
    }

    public CursoData getCurso() { return curso; }
    public void setCurso(CursoData curso) { this.curso = curso; }

    public ProfesorData getProfesor() { return profesor; }
    public void setProfesor(ProfesorData profesor) { this.profesor = profesor; }

    public List<AlumnoData> getAlumnos() { return alumnos; }
    public void setAlumnos(List<AlumnoData> alumnos) { this.alumnos = alumnos; }
}
