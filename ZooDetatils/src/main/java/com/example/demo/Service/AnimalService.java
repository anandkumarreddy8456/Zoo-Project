package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.AnimalRepository;
import com.example.demo.domain.Animal;

@Service
public class AnimalService {
	@Autowired
	private AnimalRepository repository;
	
	public List<Animal> allAnimals(){
		return repository.findAll();
	}
	public void saveAnimals(Animal animal) {
		repository.save(animal);
	}
	public Animal getoneAnimal(long id) {
		return repository.findById(id).get();
	}
	public void DeleteAnimal(long id) {
		repository.deleteById(id);
	}
}
