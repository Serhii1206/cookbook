package com.example.cookbook.dto.mapper;

public interface RequestDtoMapper<D, T> {
    T mapToModel(D dto);
}
