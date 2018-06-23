package com.vanhack.api.skipthedishes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.vanhack.api.skipthedishes")
public class SkipthedishesApplication extends SpringBootServletInitializer{

	private static final Class<SkipthedishesApplication> skipthedishesApplicationClass = SkipthedishesApplication.class;
	
	public static void main(String[] args) {
		SpringApplication.run(SkipthedishesApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(skipthedishesApplicationClass);
    }
}
