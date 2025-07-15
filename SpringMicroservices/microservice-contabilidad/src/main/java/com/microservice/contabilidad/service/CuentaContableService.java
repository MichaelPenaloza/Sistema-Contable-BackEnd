package com.microservice.contabilidad.service;

import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import com.microservice.contabilidad.model.entity.CuentaContableEntity;
import com.microservice.contabilidad.repository.CuentaContableRepository;
import java.util.List;

@Service
@AllArgsConstructor
public class CuentaContableService {
    private final CuentaContableRepository cuentaContableRepository;

    // Método para guardar una cuenta contable
    public void saveCuentaContable(CuentaContableEntity cuentaContable) {
        cuentaContableRepository.save(cuentaContable);
    }
    
    // Método para obtener todas las cuentas contables
    public List<CuentaContableEntity> obtenerCuentasContables() {
        return cuentaContableRepository.findAll();
    }

    // Método para obtener una cuenta contable por ID
    public CuentaContableEntity obtenerCuentaContablePorId(Long id) {
        return cuentaContableRepository.findById(id).orElse(null);
    }
    
}
