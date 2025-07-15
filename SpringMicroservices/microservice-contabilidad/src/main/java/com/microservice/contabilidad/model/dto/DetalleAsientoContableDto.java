package com.microservice.contabilidad.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetalleAsientoContableDto {
    private String codigoCuenta;
    private double debe;
    private double haber;
    private String descripcion;
}
