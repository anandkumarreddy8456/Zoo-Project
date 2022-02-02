package com.example.demo.domain;

public class PeopleDao {
	private long id;
	private String peoplename;
	private String favanimal;
	private String animaltype;
	public PeopleDao(long id, String peoplename, String favanimal, String animaltype) {
		super();
		this.id = id;
		this.peoplename = peoplename;
		this.favanimal = favanimal;
		this.animaltype = animaltype;
	}
	public PeopleDao() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPeoplename() {
		return peoplename;
	}
	public void setPeoplename(String peoplename) {
		this.peoplename = peoplename;
	}
	public String getFavanimal() {
		return favanimal;
	}
	public void setFavanimal(String favanimal) {
		this.favanimal = favanimal;
	}
	public String getAnimaltype() {
		return animaltype;
	}
	public void setAnimaltype(String animaltype) {
		this.animaltype = animaltype;
	}
	@Override
	public String toString() {
		return "PeopleDao [id=" + id + ", peoplename=" + peoplename + ", favanimal=" + favanimal + ", animaltype="
				+ animaltype + "]";
	}
	
}
