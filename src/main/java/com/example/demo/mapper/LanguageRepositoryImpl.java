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
	public void update(Integer langId, String name, Timestamp update) {
		mapper.update(langId, name, update);
	}

	@Override
	public Optional<Language> findById(Integer langId) {
		return mapper.findById(langId);
	}

	@Override
	public List<Language> findAll() {
		return mapper.findAll();
	}

	@Override
	public void delete(Integer langId) {
		mapper.delete(langId);
	}

}
