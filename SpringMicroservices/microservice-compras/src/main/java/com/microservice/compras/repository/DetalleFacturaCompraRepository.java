package com.microservice.compras.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.microservice.compras.model.entity.DetalleFacturaCompraEntity;
import java.util.List;

@Repository
public interface DetalleFacturaCompraRepository extends CrudRepository<DetalleFacturaCompraEntity, Long> {
    List<DetalleFacturaCompraEntity> findByFacturaCompraId(Long facturaCompraId);
}
