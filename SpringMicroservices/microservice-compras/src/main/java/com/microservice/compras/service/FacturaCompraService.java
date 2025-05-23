package com.microservice.compras.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservice.compras.model.entity.FacturaCompraEntity;
import com.microservice.compras.repository.FacturaCompraRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FacturaCompraService {
    private final FacturaCompraRepository facturaCompraRepository;

    public List<FacturaCompraEntity>  obtenerFacturaCompra() {
        return (List<FacturaCompraEntity>) facturaCompraRepository.findAll();
    }

    public void saveFacturaCompra(FacturaCompraEntity facturaCompra) {
        facturaCompraRepository.save(facturaCompra);
    }

    public FacturaCompraEntity obtenerFacturaCompraPorId(Long id) {
        return facturaCompraRepository.findById(id).orElse(null);
    }
}
