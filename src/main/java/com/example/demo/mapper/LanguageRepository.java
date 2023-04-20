package com.example.demo.mapper;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import com.example.demo.domain.Language;

public interface LanguageRepository {

	Language save(Language language);
	
	void update(Integer langId, String name, Timestamp update);
	
	Optional<Language> findById(Integer langId);
	
	List<Language> findAll();
	
	void delete(Integer langId);
}
