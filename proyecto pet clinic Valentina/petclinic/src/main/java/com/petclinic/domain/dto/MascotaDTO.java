package com.petclinic.domain.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class MascotaDTO {

    private Integer id;
    private String nombre;
    private String especie;
    private Integer edad;
    private String genero;
    private Integer propietarioId;

    // Constructor
    public MascotaDTO(Integer id, String nombre, String especie, Integer edad, String genero, Integer propietarioId) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.genero = genero;
        this.propietarioId = propietarioId;
    }
}
