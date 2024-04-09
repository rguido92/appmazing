package com.campusdual.appmazing.controller;

import com.campusdual.appmazing.api.IComprasService;
import com.campusdual.appmazing.api.IProductService;
import com.campusdual.appmazing.model.Compras;
import com.campusdual.appmazing.model.dao.ProductDao;
import com.campusdual.appmazing.model.dto.ComprasDTO;
import com.campusdual.appmazing.model.dto.ContactDTO;
import com.campusdual.appmazing.model.dto.dtomapper.ComprasMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/compras")
public class ComprasController {

    @Autowired
    private IComprasService comprasService;

    private ProductDao productDao;

    @GetMapping()
    public String testController() {
        return "Compras controller works";
    }

    @PostMapping
    public String testController(@RequestBody String name) {
        return "Compras controller works" + name;
    }

    @GetMapping(value = "/testMethod")
    public String testControllerMethod() {
        return "Compras controller method works!";
    }

    @PostMapping(value = "/getAll")
    public List<ComprasDTO> queryAllCompras(@RequestBody ContactDTO contactDTO) {
        return comprasService.queryCompraFromContact(contactDTO);
    }

    @PostMapping(value = "/add")
    public int addCompra(@RequestBody ComprasDTO comprasDTO) {
        Compras compra = ComprasMapper.INSTANCE.toEntity(comprasDTO);
        return comprasService.insertCompra(comprasDTO);
        //id del carrito id o de la persona ContactoDTO = id
    }


}
