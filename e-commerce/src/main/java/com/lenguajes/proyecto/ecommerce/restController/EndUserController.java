package com.lenguajes.proyecto.ecommerce.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lenguajes.proyecto.ecommerce.domain.EndUser;
import com.lenguajes.proyecto.ecommerce.domain.UserAddress;
import com.lenguajes.proyecto.ecommerce.repository.EndUserRepository;

@RestController
@CrossOrigin(origins ="http://localhost:3000", maxAge= 3600)
@RequestMapping(value="/api/user")
public class EndUserController {
	
	@Autowired
	EndUserRepository endUserRepo;
	
	public EndUserController(EndUserRepository endUserRepo){
		this.endUserRepo = endUserRepo;
	}
	@GetMapping(value="/")
	public List<EndUser> getAll(){
		return this.endUserRepo.findAll();
	}
	
	@GetMapping(value="/{username}/{password}")
	public  String getAuthentication (@PathVariable String username,@PathVariable String password){
		EndUser user = this.endUserRepo.findByNameuserOrEmail(username, username);
		if(user!=null){		
			if(user.getPass().equals(password)){
				System.out.println("informacion correcta");
				return "{\"mensaje\": \""+username+"\"}";
			}
		}
		return "{\"mensaje\": \"error\"}";
	}
	
	@PostMapping(value="/")
	public ResponseEntity<EndUser> AddUser(@RequestBody EndUser user ){
		System.out.println("imprimiendo datos");
		if(user.getNameUser()!=null){	
		return new ResponseEntity<EndUser>(endUserRepo.saveAndFlush(user),HttpStatus.OK);
		}
		System.out.println(user.getId()+" / "+user.getNameUser()+" / "+user.getPass()+" / "+user.getEmail());
		return null;
	}
	
	@GetMapping(value="/delete")
	public void deleteAll(){
		this.endUserRepo.deleteAll();

	}

}
