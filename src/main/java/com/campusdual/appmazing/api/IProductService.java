package com.campusdual.appmazing.api;

import com.campusdual.appmazing.model.dto.ProductDTO;

import java.util.List;

public interface IProductService {
    ProductDTO queryProduct(ProductDTO productDTO);
    List<ProductDTO>queryAllProdcuts();
    int insertProduct(ProductDTO productDTO);
    int updateProduct(ProductDTO productDTO);
    int deleteProduct(ProductDTO productDTO);
}
