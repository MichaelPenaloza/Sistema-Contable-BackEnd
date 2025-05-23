package com.microservice.productos.model.entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "producto")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "clase")
    private String clase;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "marca")
    private String marca;

    @Column(name = "factor")
    private Double factor;

    @Column(name = "costo")
    private Double costo;

    @Column(name = "precio_uno")
    private Double precioUno;

    @Column(name = "precio_dos")
    private Double precioDos;

    @Column(name = "precio_tres")
    private Double precioTres;

    @Column(name = "impuesto")
    private String impuesto;

    @Column(name = "stock")
    private Double stock;

    
}
