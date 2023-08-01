package com.avis.services.avisconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AvisConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvisConfigServerApplication.class, args);
	}

}
