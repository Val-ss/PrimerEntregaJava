package com.coderhouse.dto;

import java.util.List;

public class InscripcionRequest {

    private Long alumnoId;
    private List<Long> cursosIds;

    public Long getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(Long alumnoId) {
        this.alumnoId = alumnoId;
    }

    public List<Long> getCursosIds() {
        return cursosIds;
    }

    public void setCursosIds(List<Long> cursosIds) {
        this.cursosIds = cursosIds;
    }
}
