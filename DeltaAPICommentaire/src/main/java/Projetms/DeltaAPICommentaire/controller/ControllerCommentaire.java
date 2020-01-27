package Projetms.DeltaAPICommentaire.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Projetms.DeltaAPICommentaire.models.Commentaire;
import Projetms.DeltaAPICommentaire.repositories.CommentaireRepository;

@RestController
public class ControllerCommentaire {
	@Autowired
	private CommentaireRepository commentaireRepository;
	
	@GetMapping(value="/comment/{auteur}")
	public Commentaire getCommentaire(@PathVariable String auteur){
		return commentaireRepository.findByAuteur(auteur);
	}
	
	@GetMapping(value="/comments")
	public List<Commentaire> getCommentaires() {
		List<Commentaire> commentaires = new ArrayList<Commentaire>(); 
		commentaireRepository.findAll().forEach(commentaires::add);
		return commentaires;
	}
	
	@PostMapping(value="/add")
	public void addUser(@RequestBody Commentaire c) {
		commentaireRepository.save(c);
	}

}
