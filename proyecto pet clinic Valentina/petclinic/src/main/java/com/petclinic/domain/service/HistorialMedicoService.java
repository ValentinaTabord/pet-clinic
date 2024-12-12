package com.petclinic.domain.service;

import com.petclinic.persistence.entity.HistorialMedico;
import com.petclinic.domain.repository.HistorialMedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HistorialMedicoService {

    @Autowired
    private HistorialMedicoRepository historialMedicoRepository;

    // Crear o actualizar un historial médico
    public HistorialMedico saveHistorialMedico(HistorialMedico historialMedico) {
        return historialMedicoRepository.save(historialMedico);
    }

    // Obtener todos los historiales médicos
    public List<HistorialMedico> getAllHistorialesMedicos() {
        return historialMedicoRepository.findAll();
    }

    // Obtener un historial médico por ID
    public Optional<HistorialMedico> getHistorialMedicoById(Integer id) {
        return historialMedicoRepository.findById(id);
    }

    // Eliminar un historial médico por ID
    public void deleteHistorialMedicoById(Integer id) {
        historialMedicoRepository.deleteById(id);
    }
}
