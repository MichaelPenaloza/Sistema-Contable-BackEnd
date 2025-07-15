package com.microservice.contabilidad.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.microservice.contabilidad.model.dto.DetalleAsientoContableDto;
import com.microservice.contabilidad.model.entity.DetalleAsientoContableEntity;

@Mapper
public interface DetalleAsientoContableMapper {
    // Instancia del Mapper
    DetalleAsientoContableMapper INSTANCE = Mappers.getMapper(DetalleAsientoContableMapper.class);

    // Mapeo de DetalleAsientoContableDto a DetalleAsientoContableEntity
    DetalleAsientoContableEntity toEntity(DetalleAsientoContableDto detalleAsientoContableDto);

    // Mapeo de DetalleAsientoContableEntity a DetalleAsientoContableDto
    DetalleAsientoContableDto toDto(DetalleAsientoContableEntity detalleAsientoContableEntity);
}
