package com.petclinic.domain.dto;

import lombok.Data;

@Data
public class AlimentoDTO {

    private Integer id;
    private String nombre;
    private String tipo;
    private String marca;
    private Integer cantidadDiariaRecomendada;
    private Integer mascotaId; // Relación con Mascota usando su ID
}
