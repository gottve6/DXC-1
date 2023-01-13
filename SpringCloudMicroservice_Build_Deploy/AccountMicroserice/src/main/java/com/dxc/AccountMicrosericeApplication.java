package com.dxc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AccountMicrosericeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountMicrosericeApplication.class, args);
	}

}
