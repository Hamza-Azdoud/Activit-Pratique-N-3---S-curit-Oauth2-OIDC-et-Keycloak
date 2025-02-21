package org.spring.inventoryservice;

import org.spring.inventoryservice.entities.Product;
import org.spring.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ProductRepository productRepository) {
		return args -> {
			productRepository.save(
					Product.builder()
							.name("Computer")
							.price(2300)
							.quantity(12)
							.build()
			);
		};
	}

}
