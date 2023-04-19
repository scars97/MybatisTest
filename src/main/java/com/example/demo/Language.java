package com.example.demo;

import java.time.LocalDateTime;

public class Language {

	private Integer langId;
	private String name;
	private LocalDateTime update;
	
	public Language(Integer langId, String name, LocalDateTime update) {
		super();
		this.langId = langId;
		this.name = name;
		this.update = update;
	}

	public Integer getId() {
		return langId;
	}

	public void setId(Integer langId) {
		this.langId = langId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getUpdate() {
		return update;
	}

	public void setUpdate(LocalDateTime update) {
		this.update = update;
	}
	
}
