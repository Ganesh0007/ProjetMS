package Projetms.DeltaAPICategorie.controllers;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Projetms.DeltaAPICategorie.models.Categorie;
import Projetms.DeltaAPICategorie.repositories.CategorieRepository;

@RestController
public class CategorieController {
	@Autowired
	private CategorieRepository categorieRepository;
	
	@PostMapping(value="/add")
	public void addCategorie(@RequestBody Categorie c) {
		categorieRepository.save(c);
	}
	
	@GetMapping(value="/categorie")
	public List<Categorie> getCategories(){
		List<Categorie> list =new ArrayList<Categorie>();
		categorieRepository.findAll().forEach(list::add);
		return list;
	}
	
}
