package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.mapper.LanguageMapper2;
import com.example.demo.mapper.LanguageRepository;
import com.example.demo.mapper.LanguageRepositoryImpl;
import com.example.demo.service.LanguageService;
import com.example.demo.service.LanguageServiceImpl;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class MybatisConfig {

	private final LanguageMapper2 mapper;
	
	@Bean
	public LanguageService languageService() {
		return new LanguageServiceImpl(languageRepository());
	}
	
	@Bean
	public LanguageRepository languageRepository() {
		return new LanguageRepositoryImpl(mapper);
	}
	
	
}
