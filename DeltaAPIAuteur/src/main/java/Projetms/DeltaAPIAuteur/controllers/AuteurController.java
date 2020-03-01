package Projetms.DeltaAPIAuteur.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Projetms.DeltaAPIAuteur.models.Auteur;
import Projetms.DeltaAPIAuteur.repositories.AuteurRepository;

@RestController
public class AuteurController {

	@Autowired
	private AuteurRepository auteurRepository;
	
	@PostMapping(value="/add")
	public void addAuteur(@RequestBody Auteur a) {
		auteurRepository.save(a);
	}
	
	@PostMapping(value="/login")
	public boolean login(@RequestBody Auteur a) {
		Auteur auteur = auteurRepository.findByUsername(a.getUsername());
		if(a.getPassword().equals(auteur.getPassword())) 
			return true;
		return false;
	}
	
	public boolean existUsername(String username) {
		Auteur auteur =auteurRepository.findByUsername(username);
		if(auteur==null || auteur.getUsername()!=username)
			return false;
		else
			return true;
	}
	
	/*
	@GetMapping("/edit/{id}")
	public String showUpdateForm(@PathVariable("id") long id, Model model) {
	    Auteur auteur = auteurRepository.findById(id)
	      .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
	     
	    model.addAttribute("auteur", auteur);
	    return "update-Auteur";
	}
	
	
	@PostMapping("/update/{id}")
	public String updateUser(@PathVariable("id") long id, @Valid Auteur auteur, 
	  BindingResult result, Model model) {
	    if (result.hasErrors()) {
	    	auteur.setId(id);
	        return "update-user";
	    }
	         
	    auteurRepository.save(auteur);
	    model.addAttribute("auteurs", auteurRepository.findAll());
	    return "index";
	}
	     
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		Auteur auteur = auteurRepository.findById(id)
	      .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
		auteurRepository.delete(auteur);
	    model.addAttribute("users", auteurRepository.findAll());
	    return "index";
	}*/
	
	
	
}
