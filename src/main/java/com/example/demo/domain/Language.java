package com.example.demo.domain;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Language {

	private Integer langId;
	private String name;
	private Timestamp update;
	
	public Language(String name, Timestamp update) {
		this.name = name;
		this.update = update;
	}
	
	public Language(Integer langId, String name, Timestamp update) {
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

	public Timestamp getUpdate() {
		return update;
	}

	public void setUpdate(Timestamp update) {
		this.update = update;
	}
	
}
