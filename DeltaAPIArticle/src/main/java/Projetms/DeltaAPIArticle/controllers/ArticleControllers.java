package Projetms.DeltaAPIArticle.controllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public void addArticle(@RequestBody Article a) {
		articleRepository.save(a);
	}
	
	@GetMapping(value="/articles")
	public List<Article> getArticles(){
		List<Article> list =new ArrayList<Article>();
		articleRepository.findAll().forEach(list::add);
		return list;
	}
	
	@GetMapping(value="/articles/{id}")
	public Article getArticle(@PathVariable String id) {
		return articleRepository.findById(id);
	}
	
	@PostMapping(value="/articles")
	public List<Article> getArticlesByCategorie(@RequestBody String categorie){
		List<Article> list =new ArrayList<Article>();
		articleRepository.findByCategorie(categorie).forEach(list::add);
		return list;
	}
	
}



