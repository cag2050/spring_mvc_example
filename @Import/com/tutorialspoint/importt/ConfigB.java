package com.tutorialspoint.importt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ConfigA.class)
public class ConfigB {
	@Bean
	public B b() {
		return new B();
	}
}
