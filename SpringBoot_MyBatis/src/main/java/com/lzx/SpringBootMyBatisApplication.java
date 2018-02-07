package com.lzx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@ComponentScan("com.lzx")
@MapperScan("com.lzx")
public class SpringBootMyBatisApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootMyBatisApplication.class, args);
	}

}
