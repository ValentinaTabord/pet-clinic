package com.petclinic.domain.repository;

import com.petclinic.domain.dto.MascotaDTO;
import java.util.Optional;

public interface MascotaRepository {

    // Consultar todos los registros
    Iterable<MascotaDTO> findAll();

    // Consultar por ID
    Optional<MascotaDTO> findById(Integer id);

    // Guardar un registro
    MascotaDTO save(MascotaDTO mascotaDTO);

    // Actualizar un registro
    MascotaDTO update(MascotaDTO mascotaDTO);

    // Eliminar un registro
    void delete(Integer id);

    // Validar si existe por ID
    boolean existsById(Integer id);

    // Contar todos los registros
    long count();
}
