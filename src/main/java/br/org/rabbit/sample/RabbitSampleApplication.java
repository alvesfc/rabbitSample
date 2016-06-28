package br.org.rabbit.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"br.com.rabbit.sample.*","br.com.pexin.*"})
public class RabbitSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitSampleApplication.class, args);
	}
}
