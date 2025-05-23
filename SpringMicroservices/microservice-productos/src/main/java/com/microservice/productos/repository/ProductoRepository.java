package com.microservice.productos.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.microservice.productos.model.entity.ProductoEntity;
import java.util.List;

@Repository
public interface ProductoRepository extends CrudRepository<ProductoEntity, Long> {

    List<ProductoEntity> findByCodigo(String codigo);
}
