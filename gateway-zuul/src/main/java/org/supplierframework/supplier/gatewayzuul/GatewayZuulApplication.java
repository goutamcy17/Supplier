package org.supplierframework.supplier.gatewayzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class GatewayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayZuulApplication.class, args);
	}
}
