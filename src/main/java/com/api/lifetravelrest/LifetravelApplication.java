package com.api.lifetravelrest;

import com.api.lifetravelrest.lifetravel.domain.service.IPersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LifetravelApplication implements CommandLineRunner{

	private static final Logger LOG = LoggerFactory.getLogger(LifetravelApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LifetravelApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
