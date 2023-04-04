package com.power4j.fist.gateway;

import com.power4j.fist.autoconfigure.gateway.annotation.EnableRouteGuard;
import com.power4j.fist.boot.Verbose;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author CJ (power4j@outlook.com)
 * @since 1.0
 */
@EnableCaching
@EnableRouteGuard
@EnableDiscoveryClient
@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
		Verbose.printBootEnv(System.out);
		SpringApplication.run(GatewayApplication.class, args);
	}

}
