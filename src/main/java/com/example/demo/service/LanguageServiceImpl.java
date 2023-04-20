package com.example.demo.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Language;
import com.example.demo.mapper.LanguageRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LanguageServiceImpl implements LanguageService{

	private final LanguageRepository languageRepository;
	
	@Override
	public Language save(Language language) {
		return languageRepository.save(language);
	}

	@Override
	public void update(Integer langId, String name, Timestamp update) {
		languageRepository.update(langId, name, update);
		
	}

	@Override
	public Optional<Language> findById(Integer langId) {
		return languageRepository.findById(langId);
	}

	@Override
	public List<Language> findAll() {
		return languageRepository.findAll();
	}

	@Override
	public void delete(Integer langId) {
		languageRepository.delete(langId);
	}

}
