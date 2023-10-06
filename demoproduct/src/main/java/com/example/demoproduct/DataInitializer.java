package com.example.demoproduct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demoproduct.model.Product;
import com.example.demoproduct.repository.ProductRepository;

@Component
public class DataInitializer implements CommandLineRunner {

	@Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        initializeData();
    }

    private void initializeData() {
        productRepository.save(new Product("Laptop", 1200.0));
        productRepository.save(new Product("Smartphone", 800.0));
        productRepository.save(new Product("Tablet", 500.0));
    }
}
