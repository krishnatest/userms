package com.dxc.ms.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
public class UsersMicroserviceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersMicroserviceServerApplication.class, args);
	}
}
