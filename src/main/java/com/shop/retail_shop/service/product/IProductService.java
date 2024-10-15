package com.shop.retail_shop.service.product;

import com.shop.retail_shop.model.Product;

import java.util.List;

public interface IProductService {
    Product addProduct(Product product);
    Product updateProduct(Product product);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    void updateProduct(Product product, Long product_id);
    List<Product> getAllProducts();
    List<Product> getProductsByCategoryId(String category);
    List<Product> getProductsByBrandName(String brandName);
    List<Product> getProductsByCategoryAndBrand(String category, String brandName);
    List<Product> getProductsByName(String productName);
    List<Product> getProductsByNameAndBrand(String productName, String brandName);
    Long countProductsByNameAndBrand(String brandName, String productName);
}
