package com.microservice.productos.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder   
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDto {
    private String clase;
    private String codigo;
    private String codigoBarras;
    private String nombre;
    private String descripcion;
    private Double precio_uno;
    private Double precio_dos;
    private Double precio_tres;
    private String marca;
    private Integer stock;
    private String impuesto;
    private String estado;
    
}
