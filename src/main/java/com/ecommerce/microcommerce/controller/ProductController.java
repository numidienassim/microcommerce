package com.ecommerce.microcommerce.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@RequestMapping(value="/productList",method=RequestMethod.GET)
	public String getProducts() {
		return "Product list Total";
	}
	
	@RequestMapping(value = "/Product/{id}", method = RequestMethod.GET)
	public String getProduct(@PathVariable int id) {
		return "You are asking for product with id=  " + id;
	}
}
