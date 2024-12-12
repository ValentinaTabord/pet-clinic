-- Crear la base de datos
CREATE DATABASE petclinic;

-- Usar la base de datos
USE petclinic;

-- Tabla propietario
CREATE TABLE propietario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    direccion VARCHAR(255),
    telefono VARCHAR(15),
    correo VARCHAR(100),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- Tabla mascota
CREATE TABLE mascota (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    especie VARCHAR(50) NOT NULL,
    edad INT NOT NULL,
    genero ENUM('Macho', 'Hembra') NOT NULL,
    propietario_id INT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (propietario_id) REFERENCES propietario(id) ON DELETE CASCADE
);

-- Tabla alimento
CREATE TABLE alimento (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    tipo VARCHAR(50), -- Ejemplo: Seco, Húmedo
    fecha_compra DATE,
    cantidad INT, -- Cantidad en unidades o gramos
    mascota_id INT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (mascota_id) REFERENCES mascota(id) ON DELETE CASCADE
);

-- Tabla historial_medico
CREATE TABLE historial_medico (
    id INT AUTO_INCREMENT PRIMARY KEY,
    descripcion TEXT NOT NULL,
    fecha_visita DATE NOT NULL,
    diagnostico TEXT,
    tratamiento TEXT,
    mascota_id INT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (mascota_id) REFERENCES mascota(id) ON DELETE CASCADE
);
