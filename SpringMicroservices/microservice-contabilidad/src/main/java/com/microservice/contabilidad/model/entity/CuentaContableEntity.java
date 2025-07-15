package com.microservice.contabilidad.model.entity;
import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cuenta_contable")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CuentaContableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(columnDefinition = "VARCHAR(50)")
    private String codigo;

    @Column(columnDefinition = "VARCHAR(100)")
    private String nombre;

    @Column(columnDefinition = "VARCHAR(100)")
    private String tipo;

    @Column(columnDefinition = "VARCHAR(100)")
    private String estado;
    
    @Column(precision = 15, scale = 2)
    private BigDecimal saldo;

    @OneToMany(mappedBy = "cuentaContable", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleAsientoContableEntity> detalles;

}
