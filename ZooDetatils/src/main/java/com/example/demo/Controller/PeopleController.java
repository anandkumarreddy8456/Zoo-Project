package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Repository.PeopleRepository;
import com.example.demo.Service.AnimalService;
import com.example.demo.Service.Peopleservice;
import com.example.demo.domain.Animal;
import com.example.demo.domain.People;

@Controller
@RequestMapping("/People")
public class PeopleController {
	@Autowired
	private Peopleservice peopleservice;
	@Autowired
	private AnimalService animalservice;
	@RequestMapping("/addpeople")
	public String addstudent(Model model){
		List<Animal> listanimal=animalservice.allAnimals();
		List<People> listpeople=peopleservice.listallpeople();
		model.addAttribute("listanimal",listanimal);
		model.addAttribute("listpeople", listpeople);
		model.addAttribute("people",new People());
		System.out.println(listpeople);
		return "addpeople";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String savedetails(@ModelAttribute("people") People people){
		peopleservice.save(people);
		System.out.println(people);
		return "redirect:/People";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView editdetails(@PathVariable("id") long id){
		List<Animal> listanimal=animalservice.allAnimals();
		ModelAndView model=new ModelAndView("addpeople");
		People people=peopleservice.getone(id);
		model.addObject("people",people);
		model.addObject("listanimal",listanimal);
		return model;
	}
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") long id){
		peopleservice.delete(id);
		return "redirect:/People";
	}
}
