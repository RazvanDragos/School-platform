package com.example.demo2.service.converters;

import java.util.List;

import static java.util.stream.Collectors.toList;

public interface Converter<MODEL, DTO> {

    MODEL dtoToModel(DTO dto);

    DTO modelToDto(MODEL model);

    default List<MODEL> dtosToModels(List<DTO> dtos) {
        return dtos.stream()
                .map(this::dtoToModel)
                .collect(toList());
    }

    default List<DTO> modelsToDtos(List<MODEL> models) {
        return models.stream()
                .map(this::modelToDto)
                .collect(toList());
    }
}
