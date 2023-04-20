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
	public Optional<Language> getLangs(@PathVariable("id") Integer id) {
		return languageService.findById(id);
	}
	
	@GetMapping("/all")
	public List<Language> getLangsList(){
		return languageService.findAll();
	}
	
	@PutMapping("/")
	public void putLanguage(@RequestParam("name") String name) {
		Language language = new Language(name, Timestamp.valueOf(LocalDateTime.now()));
		languageService.save(language);
	}
	
	@PostMapping("/")
	public void postLanguage(@RequestParam("langId") Integer langId,
			@RequestParam("name") String name) {
		languageService.update(langId, name, Timestamp.valueOf(LocalDateTime.now()));
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteLanguage(@PathVariable("id") Integer langId) {
		languageService.delete(langId);
	}
}
