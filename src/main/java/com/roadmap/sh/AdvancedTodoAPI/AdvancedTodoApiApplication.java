package com.roadmap.sh.AdvancedTodoAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
public class AdvancedTodoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvancedTodoApiApplication.class, args);
	}

}
