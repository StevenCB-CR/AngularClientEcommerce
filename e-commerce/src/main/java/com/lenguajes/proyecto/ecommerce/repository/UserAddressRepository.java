package com.lenguajes.proyecto.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lenguajes.proyecto.ecommerce.domain.UserAddress;

@Repository
public interface UserAddressRepository extends JpaRepository<UserAddress, Integer>{

}
