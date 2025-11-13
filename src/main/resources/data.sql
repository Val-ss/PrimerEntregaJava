-- CREAR TABLA PROFESORES
CREATE TABLE Profesores (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(255) NOT NULL,
    Apellido VARCHAR(255) NOT NULL,
    Especialidad VARCHAR(255) NOT NULL
);

-- INSERTAR DATOS EN PROFESORES
INSERT INTO Profesores (Nombre, Apellido, Especialidad)
VALUES ('Juan', 'Pérez', 'Matemática'),
       ('Ana', 'Gómez', 'Física');

-- CREAR TABLA CURSOS
CREATE TABLE Cursos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(255) NOT NULL,
    DuracionHoras INT NOT NULL,
    Profesor_id BIGINT,
    FOREIGN KEY (Profesor_id) REFERENCES Profesores(id)
);

-- INSERTAR DATOS EN CURSOS
INSERT INTO Cursos (Nombre, DuracionHoras, Profesor_id)
VALUES ('Álgebra', 40, 1),
       ('Física Moderna', 35, 2);
