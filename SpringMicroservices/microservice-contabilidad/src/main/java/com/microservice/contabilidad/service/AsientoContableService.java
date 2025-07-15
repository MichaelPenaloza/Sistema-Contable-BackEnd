package com.microservice.contabilidad.service;
import java.util.List;
import org.springframework.stereotype.Service;

import com.microservice.contabilidad.model.entity.AsientoContableEntity;
import com.microservice.contabilidad.repository.AsientoContableRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AsientoContableService {
    private final AsientoContableRepository asientoContableRepository;

    // Guardar un asiento contable
    public void saveAsientoContable(AsientoContableEntity asientoContable) {
        asientoContableRepository.save(asientoContable);
    }

    // Obtener todos los asientos contables
    public List<AsientoContableEntity> obtenerAsientosContables() {
        return (List<AsientoContableEntity>) asientoContableRepository.findAll();
    }

    // Obtener un asiento contable por ID
    public AsientoContableEntity obtenerAsientoContablePorId(Long id) {
        return asientoContableRepository.findById(id).orElse(null);
    }
}