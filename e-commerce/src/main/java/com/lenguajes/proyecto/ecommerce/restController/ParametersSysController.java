package com.lenguajes.proyecto.ecommerce.restController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lenguajes.proyecto.ecommerce.domain.SystemParameters;
import com.lenguajes.proyecto.ecommerce.repository.SystemParametersRepository;

@CrossOrigin(origins ="http://localhost:3000", maxAge= 3600)
@RestController
@RequestMapping(value="/api/ParametrosSys")
public class ParametersSysController {
	
	@Autowired
	SystemParametersRepository parameters;
	
	@GetMapping(value="/")
	public Optional<SystemParameters> getSystemParameters(){
		Integer id=1;
		
		return parameters.findById(id) ;
	}

	@PostMapping(value="/")
	public void  updateSystemParameters(@RequestBody SystemParameters parametersSys){
		Integer id=1;
		System.out.println("salida de parametros");
		System.out.println(parametersSys.toString());
		 this.parameters.saveAndFlush(parametersSys);
	}
}
