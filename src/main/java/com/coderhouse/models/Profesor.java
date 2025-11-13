package com.coderhouse.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Profesores")
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

    @Column(name = "Apellido", nullable = false)
    private String apellido;

    @Column(name = "Especialidad", nullable = false)
    private String especialidad;

    @OneToMany(mappedBy = "profesor", fetch = FetchType.EAGER)
    private List<Curso> cursos = new ArrayList<>();

    public Profesor() {}

    public Profesor(String nombre, String apellido, String especialidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
    public List<Curso> getCursos() { return cursos; }
    public void setCursos(List<Curso> cursos) { this.cursos = cursos; }

    @Override
    public String toString() {
        return "Profesor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido +
               ", especialidad=" + especialidad + "]";
    }
}
