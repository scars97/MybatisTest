package com.example.demo.mapper;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.domain.Language;

@Mapper
public interface LanguageMapper2 {

	void save(Language language);
	
	void update(@Param("langId") Integer langId, 
			@Param("name") String name,
			@Param("update") Timestamp update);
	
	Optional<Language> findById(Integer langId);
	
	List<Language> findAll();
	
	void delete(Integer langId);
}
