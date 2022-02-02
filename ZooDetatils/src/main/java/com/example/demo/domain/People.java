package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="people")
public class People {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String peoplename;
	private String favanimal;
	private String animaltype;
	
	public String getAnimaltype() {
		return animaltype;
	}
	public void setAnimaltype(String animaltype) {
		this.animaltype = animaltype;
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
	@Override
	public String toString() {
		return "People [id=" + id + ", peoplename=" + peoplename + ", favanimal=" + favanimal + ", animaltype="
				+ animaltype + "]";
	}
	
	
}
