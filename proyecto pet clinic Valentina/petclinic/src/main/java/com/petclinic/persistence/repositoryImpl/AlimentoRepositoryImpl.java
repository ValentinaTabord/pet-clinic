package com.petclinic.persistence.repositoryImpl;

import com.petclinic.persistence.entity.Alimento;
import com.petclinic.persistence.crud.AlimentoCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AlimentoRepositoryImpl {

    @Autowired
    private AlimentoCrudRepository alimentoCrudRepository;

    // Guardar o actualizar un alimento
    public Alimento save(Alimento alimento) {
        return alimentoCrudRepository.save(alimento);
    }

    // Buscar alimento por ID
    public Optional<Alimento> findById(Integer id) {
        return alimentoCrudRepository.findById(id);
    }

    // Obtener todos los alimentos
    public List<Alimento> findAll() {
        return (List<Alimento>) alimentoCrudRepository.findAll();
    }

    // Eliminar alimento por ID
    public void deleteById(Integer id) {
        alimentoCrudRepository.deleteById(id);
    }

    // Consulta personalizada: buscar alimentos por tipo
    public List<Alimento> findByTipo(String tipo) {
        // Ejemplo de lógica personalizada para consultas avanzadas.
        // Aquí puedes usar un EntityManager o Query Methods adicionales.
        throw new UnsupportedOperationException("Método no implementado aún");
    }
}
