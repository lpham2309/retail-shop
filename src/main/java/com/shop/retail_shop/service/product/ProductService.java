package com.shop.retail_shop.service.product;

import com.shop.retail_shop.exception.ProductNotFoundException;
import com.shop.retail_shop.model.Product;
import com.shop.retail_shop.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {
    private ProductRepository productRepository;
    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product is not found"));
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.findById(id)
                .ifPresentOrElse(productRepository::delete, () -> {throw new ProductNotFoundException("Product is not found");});
    }

    @Override
    public void updateProduct(Product product, Long product_id) {

    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategoryName(category);
    }

    @Override
    public List<Product> getProductsByBrandName(String brandName) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByCategoryAndBrand(String category, String brandName) {

    }

    @Override
    public List<Product> getProductsByName(String productName) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByNameAndBrand(String productName, String brandName) {
        return List.of();
    }

    @Override
    public Long countProductsByNameAndBrand(String brandName, String productName) {
        return 0;
    }
}