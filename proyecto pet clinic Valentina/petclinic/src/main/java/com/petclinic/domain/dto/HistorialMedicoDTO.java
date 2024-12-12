package com.petclinic.domain.dto;

import lombok.Data;

@Data
public class HistorialMedicoDTO {

    private Integer id;
    private String descripcion;
    private Integer fecha; // Cambiado de LocalDate a Integer
    private Integer mascotaId; // Relación con Mascota usando su ID
}
