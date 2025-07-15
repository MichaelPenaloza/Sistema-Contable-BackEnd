package com.microservice.contabilidad.repository;

import org.springframework.stereotype.Repository;
import com.microservice.contabilidad.model.entity.AsientoContableEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

@Repository
public interface AsientoContableRepository extends JpaRepository<AsientoContableEntity, Long> {


    // Método para encontrar asientos contables por nombre del plan de cuentas
    List<AsientoContableEntity> findByNombrePlanDeCuentas(String nombrePlanDeCuentas);

}
