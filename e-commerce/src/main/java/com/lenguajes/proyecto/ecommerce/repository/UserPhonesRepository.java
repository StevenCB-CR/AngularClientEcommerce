package com.lenguajes.proyecto.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lenguajes.proyecto.ecommerce.domain.UserPhones;

@Repository
public interface UserPhonesRepository extends JpaRepository<UserPhones, Integer> {

}
