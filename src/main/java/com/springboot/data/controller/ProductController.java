package com.springboot.data.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.data.beans.ProductBean;
import com.springboot.data.exception.handler.ProductNotFoundException;
import com.springboot.data.util.ProdcutUtil;

@RestController
@RequestMapping("/product/v1")
public class ProductController {

	@GetMapping("/getProductById/{id}")
	public ResponseEntity<ProductBean> getProductById(@PathVariable int id) {
		System.out.println("In Controller getProductById");
		Optional<ProductBean> productbean = Optional
				.ofNullable(ProdcutUtil.getProducts().stream().filter(product -> product.getProductId() == id)
						.findFirst().orElseThrow(() -> new ProductNotFoundException("Product not found for: " + id)));

		return ResponseEntity.ok(productbean.get());
	}

	@GetMapping("/getAllProducts")
	public ResponseEntity<List<ProductBean>> getAllProducts() {
		System.out.println("In Controller getAllProducts");

		return ResponseEntity.ok(ProdcutUtil.getProducts());
	}
}
