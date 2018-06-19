package com.lenguajes.proyecto.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lenguajes.proyecto.ecommerce.domain.EndUser;

@Repository
public interface EndUserRepository extends JpaRepository<EndUser, Integer>{

	EndUser findByNameuserOrEmail(String name,String email);
}
