package com.microservice.contabilidad.repository;

import org.springframework.stereotype.Repository;
import com.microservice.contabilidad.model.entity.CuentaContableEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

@Repository
public interface CuentaContableRepository extends JpaRepository<CuentaContableEntity, Long> {

    // Método para encontrar cuentas contables por nombre
    List<CuentaContableEntity> findByNombre(String nombre);

    // Método para encontrar cuentas contables por tipo
    List<CuentaContableEntity> findByTipo(String tipo);
    
}
