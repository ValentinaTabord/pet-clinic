package com.petclinic.persistence.mapper;

import com.petclinic.domain.dto.AlimentoDTO;
import com.petclinic.persistence.entity.Alimento;
import com.petclinic.persistence.entity.Mascota;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-06T16:32:50-0500",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.11.1.jar, environment: Java 17.0.13 (Amazon.com Inc.)"
)
@Component
public class AlimentoMapperImpl implements AlimentoMapper {

    @Override
    public AlimentoDTO toDto(Alimento alimento) {
        if ( alimento == null ) {
            return null;
        }

        AlimentoDTO alimentoDTO = new AlimentoDTO();

        alimentoDTO.setMascotaId( alimentoMascotaId( alimento ) );
        alimentoDTO.setId( alimento.getId() );
        alimentoDTO.setNombre( alimento.getNombre() );
        alimentoDTO.setTipo( alimento.getTipo() );
        alimentoDTO.setMarca( alimento.getMarca() );
        alimentoDTO.setCantidadDiariaRecomendada( alimento.getCantidadDiariaRecomendada() );

        return alimentoDTO;
    }

    @Override
    public Alimento toEntity(AlimentoDTO alimentoDTO) {
        if ( alimentoDTO == null ) {
            return null;
        }

        Alimento alimento = new Alimento();

        alimento.setMascota( map( alimentoDTO.getMascotaId() ) );
        alimento.setId( alimentoDTO.getId() );
        alimento.setNombre( alimentoDTO.getNombre() );
        alimento.setTipo( alimentoDTO.getTipo() );
        alimento.setMarca( alimentoDTO.getMarca() );
        alimento.setCantidadDiariaRecomendada( alimentoDTO.getCantidadDiariaRecomendada() );

        return alimento;
    }

    private Integer alimentoMascotaId(Alimento alimento) {
        if ( alimento == null ) {
            return null;
        }
        Mascota mascota = alimento.getMascota();
        if ( mascota == null ) {
            return null;
        }
        Integer id = mascota.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
