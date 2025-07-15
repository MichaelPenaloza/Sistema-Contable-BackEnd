package com.microservice.contabilidad.model.dto;

import java.math.BigDecimal;
import java.util.List;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Builder   
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AsientoContableDto {
    private String tipoComprobante;
    private String nombrePlanDeCuentas;
    private List<DetalleAsientoContableDto> detalleAsientoContable;
    private String codigoDocumentoReferencia;
    private BigDecimal total;
    
}
