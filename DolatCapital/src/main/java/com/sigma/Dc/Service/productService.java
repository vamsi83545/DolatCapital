package com.sigma.Dc.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sigma.Dc.Entity.Product;
import com.sigma.Dc.Repository.productRepo;

@Service
public class productService {

	@Autowired
	private productRepo pRepo;

	public List<Product> getAllProducts() {
		return pRepo.findAll();
	}

	public Optional<Product> getProductById(int id) {
		return pRepo.findById(id);
	}

	public Product addProduct(Product product) {
		return pRepo.save(product);
	}

	public Product updateProduct(Product product) {
		return pRepo.save(product);
	}

	public void deleteById(int id) {
		pRepo.deleteById(id);
	}
	
}
