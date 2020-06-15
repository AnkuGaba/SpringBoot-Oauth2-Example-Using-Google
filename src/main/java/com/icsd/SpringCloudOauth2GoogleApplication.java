package com.icsd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudOauth2GoogleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudOauth2GoogleApplication.class, args);
		System.out.println("server start");
	}

}
