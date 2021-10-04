package br.com.estudo.facili;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class FaciliApplication {

	public static void main(String[] args) {
		SpringApplication.run(FaciliApplication.class, args);
	}

}
