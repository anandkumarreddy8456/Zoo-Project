package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Service.AnimalService;
import com.example.demo.domain.Animal;

@Controller
@RequestMapping("/Animal")
public class AnimalConroller {
	@Autowired
	private AnimalService animalservice;
	
	@GetMapping("/addAnimal")
	public String addAnimal(Model model) {
		model.addAttribute("animal",new Animal());
		return "addAnimal";
	}
	@PostMapping("/save")
	public String savedetails(@ModelAttribute("animal") Animal animal) {
		animalservice.saveAnimals(animal);
		return "redirect:/Animal";
		
	}
	@RequestMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") long id) {
		ModelAndView model=new ModelAndView("addAnimal");
		Animal animal=animalservice.getoneAnimal(id);
		model.addObject("animal",animal);
		return model;
	}
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") long id) {
		animalservice.DeleteAnimal(id);
		return "redirect:/Animal";
	}
	
}
