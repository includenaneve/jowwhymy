package com.tancky;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.tancky.repository.impl.mapper")
@SpringBootApplication
public class JowwhymyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JowwhymyApplication.class, args);
	}
}
