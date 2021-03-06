package auth.service.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"auth.service.controller"})
@ComponentScan(basePackages = {"auth.service.config"})
@EntityScan(basePackages = { "auth.service.model" })
@ComponentScan(basePackages = {"auth.service.service"})
@SpringBootApplication
public class AuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthServiceApplication.class, args);
	}

}
