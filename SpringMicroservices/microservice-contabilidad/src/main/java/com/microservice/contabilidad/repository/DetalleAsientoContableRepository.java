package com.microservice.contabilidad.repository;

import org.springframework.stereotype.Repository;
import com.microservice.contabilidad.model.entity.DetalleAsientoContableEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

@Repository
public interface DetalleAsientoContableRepository extends JpaRepository<DetalleAsientoContableEntity, Long> {
    
    // Método para encontrar detalles de asiento contable por ID de asiento contable
    List<DetalleAsientoContableEntity> findByAsientoContableId(Long asientoContableId);

    // Método para encontrar detalles de asiento contable por cuenta contable
    List<DetalleAsientoContableEntity> findByCuentaContableId(Long cuentaContableId);

    // Método para eliminar detalles de asiento contable por ID de asiento contable
    void deleteByAsientoContableId(Long asientoContableId);

    // Método para eliminar detalles de asiento contable por cuenta contable
    void deleteByCuentaContableId(Long cuentaContableId);
}
