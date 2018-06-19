package com.lenguajes.proyecto.ecommerce.restController;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lenguajes.proyecto.ecommerce.domain.Role;
import com.lenguajes.proyecto.ecommerce.repository.RoleRepository;

@CrossOrigin (origins ="http://localhost:3000", maxAge= 3600)
@RestController
@RequestMapping(value= "api/role")
public class RoleController {
	
	@Autowired
	RoleRepository roleRepository;
	
	
	public void  SetRoleController(RoleRepository roleRepository){
		this.roleRepository=roleRepository;
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Role>> getAll(){
		return new ResponseEntity<List<Role>>(this.roleRepository.findAll(), HttpStatus.OK);
	}
	

}
