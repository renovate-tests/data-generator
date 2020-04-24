package com.example.e2e;

import com.cooperl.injector.core.annotation.EnableDataGenerator;
import com.cooperl.injector.postgres.configuration.DataGeneratorPostgresConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@EnableDataGenerator
@SpringBootApplication
@Import(DataGeneratorPostgresConfig.class)
public class E2EApplication {

	public static void main(String[] args) {
		SpringApplication.run(E2EApplication.class, args);
	}

}
