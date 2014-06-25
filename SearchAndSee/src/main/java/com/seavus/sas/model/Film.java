package com.seavus.sas.model;

public class Film {
	private String title;
	private int id;

	public Film(String title) {
		this.title = title;
	}
	

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
