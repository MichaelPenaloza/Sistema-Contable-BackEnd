package com.microservice.compras.http.response;

import java.util.List;

import com.microservice.compras.model.dto.ProductoDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductosByComprasResponse {
    private List<ProductoDto> productos;
}
