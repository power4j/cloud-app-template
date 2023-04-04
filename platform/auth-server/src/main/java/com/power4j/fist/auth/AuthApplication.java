package com.power4j.fist.auth;

import com.power4j.fist.boot.Verbose;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author CJ (power4j@outlook.com)
 * @since 1.0
 */
@EnableAsync
@EnableDiscoveryClient
@SpringBootApplication
public class AuthApplication {

	public static void main(String[] args) {
		Verbose.printBootEnv(System.out);
		SpringApplication.run(AuthApplication.class, args);
	}

}
