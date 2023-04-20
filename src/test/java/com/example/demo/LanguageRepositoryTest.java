package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.domain.Language;
import com.example.demo.mapper.LanguageRepository;

@SpringBootTest
public class LanguageRepositoryTest {

	@Autowired
	LanguageRepository languageRepository;
	
	@Test
	void save() {
		//given
		Language language = new Language(8, "KO", Timestamp.valueOf(LocalDateTime.now()));
		
		//when
		Language saveLang = languageRepository.save(language);
		
		//then
		Language findLang = languageRepository.findById(language.getId()).get();
		assertThat(findLang).isEqualTo(saveLang);
	}
}
