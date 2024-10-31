package com.shop.retail_shop.repository;

import com.shop.retail_shop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface  ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategoryName(String category);

    List<Product> findByBrand(String brandName);

    List<Product> findByCategoryAndBrandName(String category, String brandName);

    List<Product> findByName(String productName);

    List<Product> findByNameAndBrand(String productName, String brandName);

    Long countByNameAndBrand(String brandName, String productName);
}
