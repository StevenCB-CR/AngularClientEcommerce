package com.lenguajes.proyecto.ecommerce.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lenguajes.proyecto.ecommerce.domain.ProductCategory;
import com.lenguajes.proyecto.ecommerce.repository.ProductCategoryRepository;

@CrossOrigin(origins ="http://localhost:3000", maxAge= 3600)
@RestController
@RequestMapping(value="/api/ProductCategory")
public class ProductCategoryController {
	
	@Autowired
	ProductCategoryRepository categoryRepository;
	
	public ProductCategoryController(ProductCategoryRepository catRepo){
		this.categoryRepository= catRepo;
	}
	
	@GetMapping(value="/")
	public ResponseEntity<List<ProductCategory>> getAll(){
		return new ResponseEntity<List<ProductCategory>>(this.categoryRepository.findAll(),HttpStatus.OK);
	}
	
	
	@PostMapping(value="/")
	public ResponseEntity<ProductCategory> AddCategory(@RequestBody ProductCategory productCategory){
		return new  ResponseEntity<ProductCategory>(this.categoryRepository.saveAndFlush(productCategory),HttpStatus.OK);		
	}
	
	@PutMapping(value="/{id}")
	public ResponseEntity<ProductCategory> UpdateCategory(@RequestBody ProductCategory productCategory){
		return new ResponseEntity<ProductCategory>(this.categoryRepository.saveAndFlush(productCategory),HttpStatus.OK);
	}
	
	@DeleteMapping(value="/{id}")
	public boolean DeleteCategory(@PathVariable int id){
		this.categoryRepository.deleteById(id);
		return true;
	}

}
