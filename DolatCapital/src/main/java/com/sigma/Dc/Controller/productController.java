package com.sigma.Dc.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sigma.Dc.Entity.Product;
import com.sigma.Dc.Service.productService;

@Controller
public class productController {

	@Autowired
	private productService pService;
	
	@GetMapping("/products")
	public String listOfemployees (Model model) {
		model.addAttribute("product",pService.getAllProducts() );
		return "index";
	}
	
	 @GetMapping("/showAddProductForm")
	    public String showAddProductForm(Model model) {
	        model.addAttribute("product", new Product());
	        return "redirect:/";
	    }
	
	@PostMapping("/products/add")
	public String addproduct( @ModelAttribute("Product")Product product) {
		pService.addProduct(product);
		return "redirect:/products?success";
	}
	 
	@GetMapping("/showUpdateForm/{id}")
	public String showUpdateForm( @PathVariable(value="id")int id,Model model){
		Optional<Product> temp = pService.getProductById(id);
	
		Product product=null;
		 
		if (temp.isPresent()) {
			product = temp.get();
		}else {
			throw new RuntimeException("no product with the given id is found, please check the id");
		}
		model.addAttribute("product", product);
		return "updateProductForm";
	}
	
	@PostMapping("/product/update")
	public String updateProduct( @ModelAttribute("Product")Product product) {
		pService.addProduct(product);
		return "redirect:/products?success";
	}
	
	@GetMapping("/products/delete/{id}")
	public String deleteProduct(@PathVariable(value = "id") int id) {
		pService.deleteById(id);
		return "redirect:/products?success";
	}
}
