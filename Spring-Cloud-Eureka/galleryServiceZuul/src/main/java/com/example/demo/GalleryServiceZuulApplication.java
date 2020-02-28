package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class GalleryServiceZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(GalleryServiceZuulApplication.class, args);
	}
	@Configuration
	class RestTemplateConfig{
		
		@Bean
		@LoadBalanced
		public RestTemplate template() {
			return new RestTemplate();
		}
	}
	
}
