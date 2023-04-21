package com.example.demo;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Language;
import com.example.demo.mapper.LanguageMapper;
import com.example.demo.service.LanguageService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/lang")
@RequiredArgsConstructor
public class LanguageController {

	private final LanguageService languageService;
	
	@GetMapping("/{id}")
	public Optional<Language> getLangs(@PathVariable("id") Integer languageId) {
		return languageService.findById(languageId);
	}
	
	@GetMapping("/all")
	public List<Language> getLangsList(){
		return languageService.findAll();
	}
	
	@PostMapping
	public Language create(@RequestBody Language language) {
//		language = new Language(language.getName());
		language = Language.builder()
					.name(language.getName())
					.build();
		
		languageService.save(language);
		return language;
	}
	
	@PutMapping("/{id}")
	public Language update(@PathVariable("id") Integer languageId,
			@RequestBody Language language) {
		
		language = Language.builder()
				.name(language.getName())
				.build();
		return languageService.update(language);
	}
	
	@DeleteMapping("/{id}")
	public String deleteLanguage(@PathVariable("id") Integer languageId) {
		languageService.delete(languageId);
		return "정상적으로 삭제되었습니다";
	}
}
