package com.microservice.productos.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.microservice.productos.model.entity.ProductoEntity;
import com.microservice.productos.repository.ProductoRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductoService {
    private final ProductoRepository productoRepository;

    public List<ProductoEntity> obtenerProductos() {
        return (List<ProductoEntity>) productoRepository.findAll();
    }

    public void saveProducto(ProductoEntity producto) {
        productoRepository.save(producto);
    }

    public ProductoEntity obtenerProductoPorId(Long id) {
        return productoRepository.findById(id).orElse(null);
    }
}