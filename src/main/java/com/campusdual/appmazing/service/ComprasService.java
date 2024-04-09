package com.campusdual.appmazing.service;

import com.campusdual.appmazing.api.IComprasService;
import com.campusdual.appmazing.model.Compras;
import com.campusdual.appmazing.model.dao.ComprasDao;
import com.campusdual.appmazing.model.dao.ProductDao;
import com.campusdual.appmazing.model.dto.ComprasDTO;
import com.campusdual.appmazing.model.dto.ContactDTO;
import com.campusdual.appmazing.model.dto.dtomapper.ComprasMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ComprasService")
@Lazy
public class ComprasService implements IComprasService {

    @Autowired
    private ComprasDao comprasDao;
    @Autowired
    private ProductDao productDao;


    public ComprasDTO queryCompras(ComprasDTO comprasDTO) {
        Compras compras = ComprasMapper.INSTANCE.toEntity(comprasDTO);
        return ComprasMapper.INSTANCE.toDTO(comprasDao.getReferenceById(compras.getId()));
    }

    @Override
    public List<ComprasDTO> queryAllCompras() {
        return List.of();
    }



    @Override
    public int insertCompra(ComprasDTO comprasDTO) {
        Compras compra = ComprasMapper.INSTANCE.toEntity(comprasDTO);
        comprasDao.saveAndFlush(compra);
        return compra.getId();
    }

    @Override
    public int updateCompra(ComprasDTO comprasDTO) {
        return insertCompra(comprasDTO);
    }

    @Override
    public int deleteCompra(ComprasDTO comprasDTO) {
        int id = comprasDTO.getId();
        Compras compra = ComprasMapper.INSTANCE.toEntity(comprasDTO);
        comprasDao.delete(compra);
        return id;
    }

    @Override
    public List<ComprasDTO> queryCompraFromContact(ContactDTO contactDTO) {
        return ComprasMapper.INSTANCE.toDTOList(comprasDao.findComprasByContactId(contactDTO.getId()));

    }
}
