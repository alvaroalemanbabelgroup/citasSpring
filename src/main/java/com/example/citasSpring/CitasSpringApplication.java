package com.example.citasSpring;

import com.example.citasSpring.infra.console.ConsoleReader;
import com.example.citasSpring.repository.impl.CitaRepositoryMemory;
import com.example.citasSpring.service.impl.CitaServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CitasSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(CitasSpringApplication.class, args);
		ConsoleReader consoleReader = new ConsoleReader(new CitaServiceImpl(new CitaRepositoryMemory()));
		consoleReader.init();
	}

}
