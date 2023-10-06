package com.xl1.fseureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FsEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FsEurekaApplication.class, args);
	}

}
