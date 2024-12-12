package com.petclinic.web.controller;

import com.petclinic.domain.dto.HistorialMedicoDTO;
import com.petclinic.domain.service.HistorialMedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/historiales")
public class HistorialMedicoController {

    @Autowired
    private HistorialMedicoService historialMedicoService;

    // Obtener todos los historiales médicos
    @GetMapping
    public ResponseEntity<List<HistorialMedicoDTO>> getAllHistoriales() {
        return ResponseEntity.ok(historialMedicoService.getAllHistoriales());
    }

    // Obtener un historial médico por ID
    @GetMapping("/{id}")
    public ResponseEntity<HistorialMedicoDTO> getHistorialById(@PathVariable Integer id) {
        return historialMedicoService.getHistorialById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Crear un nuevo historial médico
    @PostMapping
    public ResponseEntity<HistorialMedicoDTO> createHistorial(@RequestBody HistorialMedicoDTO historialMedicoDTO) {
        return ResponseEntity.ok(historialMedicoService.saveHistorial(historialMedicoDTO));
    }

    // Actualizar un historial médico existente
    @PutMapping("/{id}")
    public ResponseEntity<HistorialMedicoDTO> updateHistorial(@PathVariable Integer id, @RequestBody HistorialMedicoDTO historialMedicoDTO) {
        historialMedicoDTO.setId(id);
        return ResponseEntity.ok(historialMedicoService.saveHistorial(historialMedicoDTO));
    }

    // Eliminar un historial médico por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHistorial(@PathVariable Integer id) {
        if (historialMedicoService.deleteHistorial(id)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
