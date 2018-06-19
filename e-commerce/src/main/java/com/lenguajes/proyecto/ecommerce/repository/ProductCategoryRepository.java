package com.lenguajes.proyecto.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lenguajes.proyecto.ecommerce.domain.ProductCategory;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer>{
	
	List<ProductCategory> findByCategoryname(String name);
	

}
