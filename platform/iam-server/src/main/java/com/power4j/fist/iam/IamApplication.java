package com.power4j.fist.iam;

import com.power4j.fist.boot.Verbose;
import com.power4j.fist.boot.autoconfigure.security.annotation.TrustedSecurity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author CJ (power4j@outlook.com)
 * @date 2021/6/2
 * @since 1.0
 */
@EnableAsync
@EnableCaching
@TrustedSecurity
@EnableDiscoveryClient
@SpringBootApplication
public class IamApplication {

	public static void main(String[] args) {
		Verbose.printBootEnv(System.out);
		SpringApplication.run(IamApplication.class, args);
	}

}
