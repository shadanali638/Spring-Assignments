package com.cg.product.rest;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.NestedServletException;

import com.cg.product.entity.Product;
import com.cg.product.repo.ProductRepo;

@RestController
public class ProductController {

	@Autowired
	private ProductRepo repo;

	@GetMapping("/addproduct")
	public ModelAndView sayHello(Model model) {
		return new ModelAndView("product", "productdetails", new Product());
	}

	@PostMapping("addproduct")
	public ModelAndView addProduct(@ModelAttribute("productdetails") Product product, Model model) {
		model.addAttribute("productdetails", new Product());

		repo.saveProduct(product);

		return new ModelAndView("product", "productdetails", new Product());

	}

	@GetMapping(path = "/products", produces = "application/json")
	public List<Product> getAllProducts() {

		return repo.getAll();

	}

	@ExceptionHandler({ SQLIntegrityConstraintViolationException.class, NestedServletException.class,
			JpaSystemException.class, PersistenceException.class, ConstraintViolationException.class })
	public ModelAndView showException() {
		return new ModelAndView("Error");
	}
}
