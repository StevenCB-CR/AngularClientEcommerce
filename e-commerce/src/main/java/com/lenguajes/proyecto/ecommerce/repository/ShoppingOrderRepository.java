package com.lenguajes.proyecto.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lenguajes.proyecto.ecommerce.domain.ShoppingOrder;

@Repository
public interface ShoppingOrderRepository extends JpaRepository<ShoppingOrder, Integer>{

}
