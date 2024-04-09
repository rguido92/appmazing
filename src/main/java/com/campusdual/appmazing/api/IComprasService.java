package com.campusdual.appmazing.api;

import com.campusdual.appmazing.model.dto.ComprasDTO;
import com.campusdual.appmazing.model.dto.ContactDTO;

import java.util.List;

public interface IComprasService {
    ComprasDTO queryCompras(ComprasDTO comprasDTO);
    List<ComprasDTO> queryAllCompras();
    int insertCompra(ComprasDTO comprasDTO);
    int updateCompra(ComprasDTO comprasDTO);
    int deleteCompra(ComprasDTO comprasDTO);

    List<ComprasDTO> queryCompraFromContact(ContactDTO contactDTO);
}
