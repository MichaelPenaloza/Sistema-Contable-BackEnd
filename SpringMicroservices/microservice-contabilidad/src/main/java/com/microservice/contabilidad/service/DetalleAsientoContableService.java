package com.microservice.contabilidad.service;

import java.util.List;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import com.microservice.contabilidad.model.entity.DetalleAsientoContableEntity;
import com.microservice.contabilidad.repository.DetalleAsientoContableRepository;

@Service
@AllArgsConstructor
public class DetalleAsientoContableService {
    
    private final DetalleAsientoContableRepository detalleAsientoContableRepository;

    // Método para guardar un detalle de asiento contable
    public void saveDetalleAsientoContable(DetalleAsientoContableEntity detalle) {
        detalleAsientoContableRepository.save(detalle);
    }

    // Método para obtener todos los detalles de asiento contable
    public List<DetalleAsientoContableEntity> obtenerDetallesAsientoContable() {
        return detalleAsientoContableRepository.findAll();
    }

}
