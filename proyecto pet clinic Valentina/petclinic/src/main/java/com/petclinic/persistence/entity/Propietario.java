package com.petclinic.persistence.entity;

import lombok.Data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
@Entity
@Table(name = "propietario")
public class Propietario {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    private String direccion;

    private String telefono;

    @OneToMany(mappedBy = "propietario")
    private List<Mascota> mascotas;
}
