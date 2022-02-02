package com.example.demo.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Service.AnimalService;
import com.example.demo.Service.Peopleservice;
import com.example.demo.domain.Animal;
import com.example.demo.domain.People;



@Controller
@RequestMapping("/")
public class IndexController {
	
	@Autowired
	private AnimalService animalservice;
	@Autowired
	private Peopleservice peopleservice;
	@RequestMapping("People")
	public String viewhome(Model model) {
		List<People> listpeople=peopleservice.listallpeople();
		model.addAttribute("listpeople", listpeople);
		return "People";
	}
	@RequestMapping("/index")
	public String save() {
		return "index";
	}
	@RequestMapping("/Animal")
	public String view(Model model) {
		List<Animal> listanimal=animalservice.allAnimals();
		model.addAttribute("listanimal",listanimal);
		return "Animal";
	}
}
