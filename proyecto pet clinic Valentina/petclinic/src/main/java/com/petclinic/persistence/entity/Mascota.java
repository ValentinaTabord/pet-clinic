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
@Table(name = "mascota")
public class Mascota {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    private String especie;

    private Integer edad;

    private String genero;

    @ManyToOne
    @JoinColumn(name = "propietario_id", nullable = false)
    private Propietario propietario;

    /*@OneToMany(mappedBy = "mascota")
    private List<ControlPeso> controlPeso;

    @OneToMany(mappedBy = "mascota")
    private List<Desparasitacion> desparasitaciones;

    @OneToMany(mappedBy = "mascota")
    private List<Vacunacion> vacunaciones;*/
}
