package com.petclinic.domain.service;

import com.petclinic.persistence.entity.Alimento;
import com.petclinic.domain.repository.AlimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlimentoService {

    @Autowired
    private AlimentoRepository alimentoRepository;

    // Crear o actualizar un alimento
    public Alimento saveAlimento(Alimento alimento) {
        return alimentoRepository.save(alimento);
    }

    // Obtener todos los alimentos
    public List<Alimento> getAllAlimentos() {
        return alimentoRepository.findAll();
    }

    // Obtener un alimento por ID
    public Optional<Alimento> getAlimentoById(Integer id) {
        return alimentoRepository.findById(id);
    }

    // Eliminar un alimento por ID
    public void deleteAlimentoById(Integer id) {
        alimentoRepository.deleteById(id);
    }
}
