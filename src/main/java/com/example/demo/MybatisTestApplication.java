package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.example.demo.config.MybatisConfig;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Import(MybatisConfig.class)
@SpringBootApplication
public class MybatisTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisTestApplication.class, args);
	}

}
