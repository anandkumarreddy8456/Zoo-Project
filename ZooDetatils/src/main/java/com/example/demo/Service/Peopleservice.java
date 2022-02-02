package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.PeopleRepository;
import com.example.demo.domain.People;

@Service

public class Peopleservice {
	@Autowired
	private PeopleRepository repository;
	
	public List<People> listallpeople(){
		return repository.findAll();
	}
	public void save(People people) {
		repository.save(people);
	}
	public void delete(long id) {
		repository.deleteById(id);
	}
	public People getone(long id) {
		return repository.findById(id).get();
	}
}
