package com.petclinic.persistence.crud;

import com.petclinic.persistence.entity.Alimento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlimentoCrudRepository extends CrudRepository<Alimento, Integer> {
}
