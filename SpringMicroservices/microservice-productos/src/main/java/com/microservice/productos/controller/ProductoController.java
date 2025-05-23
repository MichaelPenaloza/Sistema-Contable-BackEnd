package com.microservice.productos.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microservice.productos.model.entity.ProductoEntity;
import com.microservice.productos.service.ProductoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/producto")
@AllArgsConstructor
public class ProductoController {
    
    private final ProductoService productoService;

    @PostMapping("/crear")
    public void crearProducto(@RequestBody ProductoEntity producto) {
        productoService.saveProducto(producto);
    }

    @GetMapping("/obtener-productos")
    public List<ProductoEntity> obtenerProductos() {
        return productoService.obtenerProductos();
    }

    @GetMapping("obtener-por-id")
    public ProductoEntity obtenerProductoPorId(@RequestParam Long id) {
        return productoService.obtenerProductoPorId(id);
    }
}