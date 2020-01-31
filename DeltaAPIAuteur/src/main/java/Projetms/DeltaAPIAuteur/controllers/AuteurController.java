package Projetms.DeltaAPIAuteur.controllers;

import org.springframework.beans.factory.annotation.Autowired;
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
}
