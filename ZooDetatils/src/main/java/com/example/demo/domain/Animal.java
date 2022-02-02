package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Animal")
public class Animal {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String animalname;
	private String animaltype;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAnimalname() {
		return animalname;
	}
	public void setAnimalname(String animalname) {
		this.animalname = animalname;
	}
	public String getAnimaltype() {
		return animaltype;
	}
	public void setAnimaltype(String animaltype) {
		this.animaltype = animaltype;
	}
	@Override
	public String toString() {
		return "Animal [id=" + id + ", animalname=" + animalname + ", animaltype=" + animaltype + "]";
	}
	
}
