package com.tdt.edu.vn.works.controller;

import com.tdt.edu.vn.works.domain.Product;
import com.tdt.edu.vn.works.repository.ProductRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;




@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	private ProductRepository productRepository;
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	public List<Product> getDataIndex() {
		System.out.println("--home--");
		Product product = new Product();
		product.setId("1");
		product.setName("Laptop DELL");
		product.setPrice(10300000);
		productRepository.save(product);
		return productRepository.findAll();
	}
}
