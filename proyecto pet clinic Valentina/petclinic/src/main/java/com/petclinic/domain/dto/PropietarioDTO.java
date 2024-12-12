package com.petclinic.domain.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class PropietarioDTO {

    private Integer id;
    private String nombre;
    private String direccion;
    private String telefono;

    // Constructor
    public PropietarioDTO(Integer id, String nombre, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
}
