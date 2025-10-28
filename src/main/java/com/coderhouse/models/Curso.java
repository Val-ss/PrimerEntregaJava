package com.coderhouse.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

    @Column(name = "Codigo", nullable = false, unique = true)
    private String codigo;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Alumno> alumnos = new ArrayList<>();

    @ManyToOne
    private Profesor profesor;

    public Curso() {
    }

    public Curso(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.alumnos = new ArrayList<>();
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public List<Alumno> getAlumnos() { return alumnos; }
    public void setAlumnos(List<Alumno> alumnos) { this.alumnos = alumnos; }

    public Profesor getProfesor() { return profesor; }
    public void setProfesor(Profesor profesor) { this.profesor = profesor; }

    @Override
    public String toString() {
        return "Curso [id=" + id + ", nombre=" + nombre + ", codigo=" + codigo +
               ", alumnos=" + alumnos + ", profesor=" + profesor + "]";
    }
}
