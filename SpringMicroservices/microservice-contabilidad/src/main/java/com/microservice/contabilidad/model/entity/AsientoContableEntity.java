package com.microservice.contabilidad.model.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;


@Entity
@Table(name = "asiento_contable")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AsientoContableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "tipo_comprobante_id", nullable = false)
    private TipoComprobanteEntity tipoComprobante;

    @Column(name = "nombre_plan_de_cuentas",columnDefinition = "VARCHAR(50)")
    private String nombrePlanDeCuentas;

    @OneToMany(mappedBy = "asientoContable", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleAsientoContableEntity> detalleAsientoContable;

    @Column(columnDefinition = "VARCHAR(50)")
    private String codigoDocumentoReferencia;


    @Column(precision = 15, scale = 2)
    private BigDecimal total;

}
