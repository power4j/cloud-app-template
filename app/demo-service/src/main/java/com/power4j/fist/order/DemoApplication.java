package com.power4j.fist.order;

import com.power4j.fist.boot.autoconfigure.security.annotation.TrustedSecurity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author CJ (power4j@outlook.com)
 * @since 1.0
 */
@TrustedSecurity
@EnableDiscoveryClient
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
