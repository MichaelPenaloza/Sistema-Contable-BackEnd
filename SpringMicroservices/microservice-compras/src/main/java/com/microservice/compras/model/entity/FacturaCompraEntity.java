package com.microservice.compras.model.entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "factura_compra")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FacturaCompraEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "estado")
    private String estado;

    @Column(name = "tipo_pago")
    private String tipoPago;

    @Column(name = "agencia")
    private String agencia;

    @Column(name = "punto_emision")
    private String puntoEmision;

    @Column(name = "numero_factura")
    private String numeroFactura;

    @Column(name = "numero_autorizacion")
    private String numeroAutorizacion;

    @Column(name = "proveedor")
    private String proveedor;

    @Column(name = "ruc_proveedor")
    private String rucProveedor;

    @Column(name = "factura_proveedor")
    private String facturaProveedor;

    @Column(name = "fecha")
    private String fecha;

    @Column(name = "fecha_vencimiento")
    private String fechaVencimiento;

    @Column(name = "transporte")
    private String transporte;

    @Column(name = "observaciones")
    private String observaciones;

    @Column(name = "usuario_creacion")
    private String usuarioCreacion;

    @Column(name = "fecha_creacion")
    private String fechaCreacion;

    @Column(name = "total")
    private Double total;

    @Column(name = "subtotal")
    private Double subtotal;
    private Double subtotal0;

    @Column(name = "total_descuentos")
    private Double totalDescuentos;

    @Column(name = "total_iva")
    private Double totalIva;

    @Column(name = "total_ice")
    private Double totalIce;

    @Column(name = "total_transporte")
    private Double totalTransporte;
}
