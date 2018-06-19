package com.lenguajes.proyecto.ecommerce.config;
/*
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.lenguajes.proyecto.ecommerce.domain.EndUser;
import com.lenguajes.proyecto.ecommerce.domain.UserPhones;

public class CustomUserDetails implements UserDetails{

	
	private static final long serialVersionUID = 1L;
	
	private String nameuser;
	private String pass;
	Collection<? extends GrantedAuthority> authorities;
	
	public CustomUserDetails(EndUser user){
		this.nameuser= user.getNameUser();
		this.pass=user.getPass();
		List<GrantedAuthority> auths = new ArrayList<>();
		for(UserPhones role : user.getUserPhonesCollection())
			auths.add(new SimpleGrantedAuthority(role.getUserPhonesPK().getPhone()+""));//obtenido improvisado 
		this.authorities= auths ;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return pass;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return nameuser;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
*/