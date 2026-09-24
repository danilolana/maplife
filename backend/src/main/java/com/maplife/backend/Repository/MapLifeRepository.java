package com.maplife.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maplife.maplife.backend.model.Maplife;
@Repository


public interface ProductRepository extends JpaRepository<Product, Long> {
    
}