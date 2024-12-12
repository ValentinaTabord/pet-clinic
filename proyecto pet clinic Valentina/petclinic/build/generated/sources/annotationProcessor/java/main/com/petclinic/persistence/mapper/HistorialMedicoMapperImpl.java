package com.petclinic.persistence.mapper;

import com.petclinic.domain.dto.HistorialMedicoDTO;
import com.petclinic.persistence.entity.HistorialMedico;
import com.petclinic.persistence.entity.Mascota;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-06T16:32:50-0500",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.11.1.jar, environment: Java 17.0.13 (Amazon.com Inc.)"
)
@Component
public class HistorialMedicoMapperImpl implements HistorialMedicoMapper {

    @Override
    public HistorialMedicoDTO toDto(HistorialMedico historialMedico) {
        if ( historialMedico == null ) {
            return null;
        }

        HistorialMedicoDTO historialMedicoDTO = new HistorialMedicoDTO();

        historialMedicoDTO.setMascotaId( historialMedicoMascotaId( historialMedico ) );
        historialMedicoDTO.setId( historialMedico.getId() );
        historialMedicoDTO.setDescripcion( historialMedico.getDescripcion() );
        historialMedicoDTO.setFecha( historialMedico.getFecha() );

        return historialMedicoDTO;
    }

    @Override
    public HistorialMedico toEntity(HistorialMedicoDTO historialMedicoDTO) {
        if ( historialMedicoDTO == null ) {
            return null;
        }

        HistorialMedico historialMedico = new HistorialMedico();

        historialMedico.setMascota( map( historialMedicoDTO.getMascotaId() ) );
        historialMedico.setId( historialMedicoDTO.getId() );
        historialMedico.setDescripcion( historialMedicoDTO.getDescripcion() );
        historialMedico.setFecha( historialMedicoDTO.getFecha() );

        return historialMedico;
    }

    private Integer historialMedicoMascotaId(HistorialMedico historialMedico) {
        if ( historialMedico == null ) {
            return null;
        }
        Mascota mascota = historialMedico.getMascota();
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
