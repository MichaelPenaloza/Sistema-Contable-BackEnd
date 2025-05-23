package com.microservice.compras.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.compras.model.entity.FacturaCompraEntity;
import com.microservice.compras.service.FacturaCompraService;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@AllArgsConstructor
@RestController
@RequestMapping("/api/factura-compra")
public class FacturaCompraController {

    private final FacturaCompraService facturaCompraService;

    @PostMapping("/crear")
    public void crearFacturaCompra(@RequestBody FacturaCompraEntity facturaCompra) {
        facturaCompraService.saveFacturaCompra(facturaCompra);
    }

    @GetMapping("/obtener-todos")
    public List<FacturaCompraEntity> obtenerFacturaCompra() {
        return facturaCompraService.obtenerFacturaCompra();
    }

    @GetMapping("obtener-por-id")
    public FacturaCompraEntity obtenerFacturaCompraPorId(@RequestParam Long id) {
        return facturaCompraService.obtenerFacturaCompraPorId(id);
    }

    
   
}
