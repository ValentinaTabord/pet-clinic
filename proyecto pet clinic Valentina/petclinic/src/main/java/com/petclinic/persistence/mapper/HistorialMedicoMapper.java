package com.petclinic.persistence.mapper;

import com.petclinic.domain.dto.HistorialMedicoDTO;
import com.petclinic.persistence.entity.HistorialMedico;
import com.petclinic.persistence.entity.Mascota;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.InheritInverseConfiguration;

@Mapper(componentModel = "spring")
public interface HistorialMedicoMapper {

    // Mapeo de HistorialMedico a HistorialMedicoDTO
    @Mapping(source = "mascota.id", target = "mascotaId")
    HistorialMedicoDTO toDto(HistorialMedico historialMedico);

    // Mapeo inverso de HistorialMedicoDTO a HistorialMedico
    @InheritInverseConfiguration
    @Mapping(target = "mascota", source = "mascotaId")
    HistorialMedico toEntity(HistorialMedicoDTO historialMedicoDTO);

    // Método explícito para convertir Mascota a Integer (id)
    default Integer map(Mascota mascota) {
        return mascota != null ? mascota.getId() : null;
    }

    // Método explícito para convertir Integer (id) a Mascota
    default Mascota map(Integer mascotaId) {
        if (mascotaId != null) {
            Mascota mascota = new Mascota();
            mascota.setId(mascotaId);
            return mascota;
        }
        return null;
    }
}
