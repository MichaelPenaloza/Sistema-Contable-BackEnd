package com.microservice.compras.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.microservice.compras.client.ProductoClient;
import com.microservice.compras.http.response.ProductosByComprasResponse;
import com.microservice.compras.model.dto.ProductoDto;
import com.microservice.compras.model.entity.DetalleFacturaCompraEntity;
import com.microservice.compras.repository.DetalleFacturaCompraRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DetalleFacturaCompraService {
    private final DetalleFacturaCompraRepository detalleFacturaCompraRepository;
    private final ProductoClient productoClient;

    public List<DetalleFacturaCompraEntity> obtenerDetallesFacturaCompra() {
        return (List<DetalleFacturaCompraEntity>) detalleFacturaCompraRepository.findAll();
    }

    public void saveDetalleFacturaCompra(DetalleFacturaCompraEntity detalleFacturaCompra) {
        detalleFacturaCompraRepository.save(detalleFacturaCompra);
    }

    public DetalleFacturaCompraEntity obtenerDetalleFacturaCompraPorId(Long id) {
        return detalleFacturaCompraRepository.findById(id).orElse(null);
    }

    public List<DetalleFacturaCompraEntity> obtenerDetallesPorIdFactura(Long idFactura) {
        return detalleFacturaCompraRepository.findByFacturaCompraId(idFactura);
    }
 
    public ProductosByComprasResponse obtenerProductos(){
        List<ProductoDto> productos = productoClient.obtenerProductos();
        return ProductosByComprasResponse.builder()
                .productos(productos)
                .build();
    }

    }
 