package com.seavus.sas.model;

public class Film {
	private String title;
	private int id;
	private String nameFilm = null;
	private Integer ryear = null;
	private String producer = null;
	private String category = null;
	private String description = null;

	public Film(String title) {
		this.title = title;
	}
	
	public Film(String nameFilm, Integer ryear, String producer,
			String category, String description) {
		this.nameFilm = nameFilm;
		this.ryear = ryear;
		this.producer = producer;
		this.category = category;
		this.description = description;
	}

	public String getNameFilm() {
		return nameFilm;
	}

	public void setNameFilm(String nameFilm) {
		this.nameFilm = nameFilm;
	}

	public Integer getRyear() {
		return ryear;
	}

	public void setRyear(Integer ryear) {
		this.ryear = ryear;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	//*************************************

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Film [title=" + title + ", id=" + id + "]";
	}

}
