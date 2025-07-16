package com.example.buysell.repositories;

import com.example.buysell.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.ListResourceBundle;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTitle(String title);
}
