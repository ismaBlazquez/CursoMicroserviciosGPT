package com.example.demoproduct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demoproduct.exception.ProductNotFoundException;
import com.example.demoproduct.model.Product;
import com.example.demoproduct.repository.ProductRepository;

public class ProductServiceImpl {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
 
    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found with id: " + id));
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product updatedProduct) {
    	Product existingProduct = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found with id: " + id));

        existingProduct.setName(updatedProduct.getName());
        existingProduct.setPrice(updatedProduct.getPrice());

        return productRepository.save(existingProduct);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
