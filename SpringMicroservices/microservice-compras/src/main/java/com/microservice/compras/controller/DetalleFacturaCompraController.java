package com.microservice.compras.controller;


import com.microservice.compras.model.dto.ProductoDto;
import com.microservice.compras.model.entity.DetalleFacturaCompraEntity;
import com.microservice.compras.service.DetalleFacturaCompraService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/detalle-factura-compra")
@AllArgsConstructor
public class DetalleFacturaCompraController {

    private final DetalleFacturaCompraService detalleFacturaCompraService;

    @PostMapping("/crear")
    public void crearDetalleFacturaCompra(@RequestBody DetalleFacturaCompraEntity detalleFacturaCompra) {
        detalleFacturaCompraService.saveDetalleFacturaCompra(detalleFacturaCompra);
    }

    @GetMapping("/obtener-todos")
    public List<DetalleFacturaCompraEntity> obtenerDetallesFacturaCompra() {
        return detalleFacturaCompraService.obtenerDetallesFacturaCompra();
    }

    @GetMapping("/obtener-por-id")
    public DetalleFacturaCompraEntity obtenerDetalleFacturaCompraPorId(@RequestParam Long id) {
        return detalleFacturaCompraService.obtenerDetalleFacturaCompraPorId(id);
    }

    @GetMapping("/obtener-por-id-factura")
    public List<DetalleFacturaCompraEntity> obtenerDetallesPorIdFactura(@RequestParam Long idFactura) {
        return detalleFacturaCompraService.obtenerDetallesPorIdFactura(idFactura);
    }
 
    @GetMapping("/obtener-productos")
    public List<ProductoDto> obtenerProductos() {
        return detalleFacturaCompraService.obtenerProductos().getProductos();
    }
    
}