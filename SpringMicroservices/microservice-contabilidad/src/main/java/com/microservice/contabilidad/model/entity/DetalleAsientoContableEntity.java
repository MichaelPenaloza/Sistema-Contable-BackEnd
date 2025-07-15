package com.microservice.contabilidad.model.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Column;
import java.math.BigDecimal;

    
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "detalle_asiento_contable")
public class DetalleAsientoContableEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "VARCHAR(50)")
    private String codigoCuenta;

    @Column(precision = 15, scale = 2)
    private BigDecimal debe;

    @Column(precision = 15, scale = 2)
    private BigDecimal haber;

    @Column(columnDefinition = "VARCHAR(255)")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "asiento_id", nullable = false)
    private AsientoContableEntity asientoContable;

    @ManyToOne
    @JoinColumn(name = "cuenta_contable_id", nullable = false)
    private CuentaContableEntity cuentaContable;

}
