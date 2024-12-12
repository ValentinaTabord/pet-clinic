package com.petclinic.persistence.crud;

import com.petclinic.persistence.entity.HistorialMedico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialMedicoCrudRepository extends CrudRepository<HistorialMedico, Integer> {
}
