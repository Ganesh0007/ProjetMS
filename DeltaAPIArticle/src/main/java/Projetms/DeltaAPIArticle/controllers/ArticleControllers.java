package Projetms.DeltaAPIArticle.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Projetms.DeltaAPIArticle.models.Article;
import Projetms.DeltaAPIArticle.repositories.ArticleRepository;

@RestController
public class ArticleControllers {
	@Autowired
	private ArticleRepository articleRepository;
	
	@PostMapping(value="/add")
	public void addAuteur(@RequestBody Article a) {
		articleRepository.save(a);
	}
	
	@PostMapping(value="/login")
	public boolean login(@RequestBody Article a) {
		Article auteur = articleRepository.findByUsername(a.getUsername());
		if(a.getPassword().equals(auteur.getPassword())) 
			return true;
		return false;
	}

}








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
