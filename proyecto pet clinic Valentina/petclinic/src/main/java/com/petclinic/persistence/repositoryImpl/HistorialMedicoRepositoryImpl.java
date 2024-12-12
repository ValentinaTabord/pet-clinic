package com.petclinic.persistence.repositoryImpl;

import com.petclinic.persistence.entity.HistorialMedico;
import com.petclinic.persistence.crud.HistorialMedicoCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class HistorialMedicoRepositoryImpl {

    @Autowired
    private HistorialMedicoCrudRepository historialMedicoCrudRepository;

    // Guardar o actualizar un historial médico
    public HistorialMedico save(HistorialMedico historialMedico) {
        return historialMedicoCrudRepository.save(historialMedico);
    }

    // Buscar historial médico por ID
    public Optional<HistorialMedico> findById(Integer id) {
        return historialMedicoCrudRepository.findById(id);
    }

    // Obtener todos los historiales médicos
    public List<HistorialMedico> findAll() {
        return (List<HistorialMedico>) historialMedicoCrudRepository.findAll();
    }

    // Eliminar historial médico por ID
    public void deleteById(Integer id) {
        historialMedicoCrudRepository.deleteById(id);
    }

    // Consulta personalizada: buscar historiales por rango de fechas
    public List<HistorialMedico> findByFechaRange(Integer fechaInicio, Integer fechaFin) {
        // Ejemplo de lógica personalizada para consultas avanzadas.
        // Aquí puedes usar un EntityManager o Query Methods adicionales.
        throw new UnsupportedOperationException("Método no implementado aún");
    }
}
