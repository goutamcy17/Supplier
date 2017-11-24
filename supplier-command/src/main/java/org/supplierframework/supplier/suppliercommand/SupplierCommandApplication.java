package org.supplierframework.supplier.suppliercommand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SupplierCommandApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupplierCommandApplication.class, args);
	}
}
