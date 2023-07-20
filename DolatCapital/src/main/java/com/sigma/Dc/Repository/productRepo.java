package com.sigma.Dc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sigma.Dc.Entity.Product;

public interface productRepo extends JpaRepository<Product, Integer>{

}
