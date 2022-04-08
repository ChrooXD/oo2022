package com.example.webshop.repository;

import com.example.webshop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProductDBRepository extends JpaRepository<Product, Long> {
}
