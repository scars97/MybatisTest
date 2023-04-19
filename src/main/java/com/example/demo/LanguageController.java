package com.example.demo;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.LanguageMapper;

@RestController
public class LanguageController {

	private LanguageMapper mapper;
	
	public LanguageController(LanguageMapper mapper) {
		this.mapper = mapper;
	}
	
	@GetMapping("/lang/{id}")
	public Language getLangs(@PathVariable("id") Integer id) {
		return mapper.getLangs(id);
	}
	
	@GetMapping("/lang/all")
	public List<Language> getLangsList(){
		return mapper.getLangsList();
	}
	
	@PutMapping("/lang/{id}")
	public void putLanguage(@PathVariable("id") String id,
			@RequestParam("langId") Integer langId,
			@RequestParam("name") String name) {
		mapper.putLanguage(langId, name,Timestamp.valueOf(LocalDateTime.now()));
	}
	
	@PostMapping("/lang/{id}")
	public void postLanguage(@PathVariable("id") String id,
			@RequestParam("langId") Integer langId,
			@RequestParam("name") String name) {
		mapper.postLanguage(langId, name, Timestamp.valueOf(LocalDateTime.now()));
		
	}
	
	@DeleteMapping("/lang/{id}")
	public void deleteLanguage(@PathVariable("id") Integer langId) {
		mapper.deleteLanguage(langId);
	}
}
