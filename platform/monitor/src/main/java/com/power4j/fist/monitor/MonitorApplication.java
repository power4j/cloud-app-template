package com.power4j.fist.monitor;

import com.power4j.fist.boot.Verbose;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author CJ (power4j@outlook.com)
 * @date 2021/6/20
 * @since 1.0
 */
@EnableAdminServer
@EnableDiscoveryClient
@SpringBootApplication
public class MonitorApplication {

	public static void main(String[] args) {
		Verbose.printBootEnv(System.out);
		SpringApplication.run(MonitorApplication.class, args);
	}

}
