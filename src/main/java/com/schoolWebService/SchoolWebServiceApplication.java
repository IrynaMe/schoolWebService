package com.schoolWebService;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@OpenAPIDefinition(info = @Info(title = "wsrest API", version = "3.0", description = "wsrest"))
@SpringBootApplication
@SecurityScheme(
		name = "wsRestSecurityScheme",
		type = SecuritySchemeType.HTTP,
		bearerFormat = "JWT",
		scheme = "bearer"
)
//@EnableJpaRepositories("com.schoolWebService.repositories") // Specify the package where your repositories are
//@EntityScan("com.schoolWebService.entities") // Specify the package where your entities are
public class SchoolWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolWebServiceApplication.class, args);
	}

}
