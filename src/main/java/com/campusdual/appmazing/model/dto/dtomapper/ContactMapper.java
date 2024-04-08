package com.campusdual.appmazing.model.dto.dtomapper;

import com.campusdual.appmazing.model.dto.ContactDTO;
import com.campusdual.appmazing.model.Contacto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ContactMapper {

    ContactMapper INSTANCE = Mappers.getMapper(ContactMapper.class);

    ContactDTO toDTO(Contacto contacto);

    List<ContactDTO> toDTOList(List<Contacto> contact);

    Contacto toEntity(ContactDTO contact);
}
