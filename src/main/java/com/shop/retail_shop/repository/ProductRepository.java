package com.shop.retail_shop.repository;

import com.shop.retail_shop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategoryName(String category);
}