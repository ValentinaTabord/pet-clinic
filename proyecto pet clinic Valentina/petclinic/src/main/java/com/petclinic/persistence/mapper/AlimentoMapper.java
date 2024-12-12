package com.petclinic.persistence.mapper;

import com.petclinic.domain.dto.AlimentoDTO;
import com.petclinic.persistence.entity.Alimento;
import com.petclinic.persistence.entity.Mascota;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.InheritInverseConfiguration;

@Mapper(componentModel = "spring")
public interface AlimentoMapper {

    // Mapeo de Alimento a AlimentoDTO
    @Mapping(source = "mascota.id", target = "mascotaId")
    AlimentoDTO toDto(Alimento alimento);

    // Mapeo inverso de AlimentoDTO a Alimento
    @InheritInverseConfiguration
    @Mapping(target = "mascota", source = "mascotaId")
    Alimento toEntity(AlimentoDTO alimentoDTO);

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
