package com.food.springBootWithElasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//in the application class exclude the datasource bean loading
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@EnableElasticsearchRepositories(basePackages = { "com.food.springBootWithElasticsearch.repository" })
@SpringBootApplication
public class SpringBootWithElasticsearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithElasticsearchApplication.class, args);
	}
}
