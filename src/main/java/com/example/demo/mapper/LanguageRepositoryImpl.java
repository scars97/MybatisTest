package com.example.demo.mapper;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.Language;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class LanguageRepositoryImpl implements LanguageRepository{

	private final LanguageMapper2 mapper;
	
	@Override
	public Language save(Language language) {
		mapper.save(language);
		return language;
	}

	@Override
	public Language update(Language language) {
		return mapper.update(language);
		
	}

	@Override
	public Optional<Language> findById(Integer languageId) {
		return mapper.findById(languageId);
	}

	@Override
	public List<Language> findAll() {
		return mapper.findAll();
	}

	@Override
	public void delete(Integer languageId) {
		mapper.delete(languageId);
	}

}
