package com.petclinic.web.controller;

import com.petclinic.domain.dto.AlimentoDTO;
import com.petclinic.domain.service.AlimentoService;
import com.petclinic.persistence.entity.Alimento;
import com.petclinic.persistence.mapper.AlimentoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alimentos")
public class AlimentoController {

    @Autowired
    private AlimentoService alimentoService;

    // Obtener todos los alimentos
    @GetMapping
    public ResponseEntity<List<Alimento>> getAllAlimentos() {
        return ResponseEntity.ok(alimentoService.getAllAlimentos());
    }

    // Obtener un alimento por ID
    @GetMapping("/{id}")
    public ResponseEntity<Alimento> getAlimentoById(@PathVariable Integer id) {
        return alimentoService.getAlimentoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Crear un nuevo alimento
    @PostMapping
    public ResponseEntity<AlimentoDTO> createAlimento(@RequestBody AlimentoDTO alimentoDTO) {
        return ResponseEntity.ok(alimentoService.saveAlimento(alimentoDTO));
    }

    // Actualizar un alimento existente
    @PutMapping("/{id}")
    public ResponseEntity<AlimentoDTO> updateAlimento(@PathVariable Integer id, @RequestBody AlimentoDTO alimentoDTO) {
        alimentoDTO.setId(id);
        return ResponseEntity.ok(alimentoService.saveAlimento(alimentoDTO));
    }

    // Eliminar un alimento por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAlimento(@PathVariable Integer id) {
        if (alimentoService.deleteAlimento(id)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
