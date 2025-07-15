package com.microservice.contabilidad.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.microservice.contabilidad.model.dto.AsientoContableDto;
import com.microservice.contabilidad.model.entity.AsientoContableEntity;

@Mapper
public interface AsientoContableMapper {
    
    // Instancia del Mapper
    public static final AsientoContableMapper INSTANCE = Mappers.getMapper(AsientoContableMapper.class);

    // Mapeo de AsientoContableDto a AsientoContableEntity
    AsientoContableEntity toEntity(AsientoContableDto asientoContableDto);

    // Mapeo de AsientoContableEntity a AsientoContableDto
    AsientoContableDto toDto(AsientoContableEntity asientoContableEntity);
}
