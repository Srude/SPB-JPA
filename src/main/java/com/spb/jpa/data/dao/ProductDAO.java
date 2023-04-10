package com.spb.jpa.data.dao;


import com.spb.jpa.entity.ProductEntity;

public interface ProductDAO {
    ProductEntity insertProduct(ProductEntity entity);
    ProductEntity selectProduct(Long number);
    ProductEntity updateProductName(Long number, String name) throws Exception;
    void deleteProduct(Long number) throws Exception;

}
