package com.campusdual.appmazing.model.dto.dtomapper;

import com.campusdual.appmazing.model.Compras;
import com.campusdual.appmazing.model.dto.ComprasDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ComprasMapper {
    ComprasMapper INSTANCE = Mappers.getMapper(ComprasMapper.class);

    ComprasDTO toDTO(Compras compras);

    List<ComprasDTO> toDTOList(List<Compras> compras);

    Compras toEntity(ComprasDTO comprasDTO);}
