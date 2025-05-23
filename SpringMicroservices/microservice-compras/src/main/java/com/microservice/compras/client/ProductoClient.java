package com.microservice.compras.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.microservice.compras.model.dto.ProductoDto;

@FeignClient(name = "microservice-productos")
public interface ProductoClient {

    @GetMapping("/api/producto/obtener-productos")
    List<ProductoDto> obtenerProductos();
}
