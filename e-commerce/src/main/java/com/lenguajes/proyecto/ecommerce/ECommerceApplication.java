package com.lenguajes.proyecto.ecommerce;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import com.lenguajes.proyecto.ecommerce.config.CustomUserDetails;
import com.lenguajes.proyecto.ecommerce.repository.EndUserRepository;
*/
@SpringBootApplication
public class ECommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
	}
	
	/*@Autowired
	public void authenticationManager(AuthenticationManagerBuilder builder,EndUserRepository repo )throws Exception{
		
		builder.userDetailsService(new UserDetailsService(){

			@Override
			public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
				
				return new CustomUserDetails(repo.findByNameuser(username));
			}
			
		});
	}*/
}
