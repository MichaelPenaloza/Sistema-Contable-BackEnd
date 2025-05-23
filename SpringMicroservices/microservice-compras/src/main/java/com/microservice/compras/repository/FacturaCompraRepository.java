package com.microservice.compras.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.microservice.compras.model.entity.FacturaCompraEntity;


@Repository
public interface FacturaCompraRepository extends CrudRepository<FacturaCompraEntity, Long> {

    List<FacturaCompraEntity> findByEstado(String estado);
}
