package io.capgemini.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductItemFoodApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductItemFoodApplication.class, args);
	}

}
