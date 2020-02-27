package ProjetMS.Client.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import ProjetMS.Client.Model.User; 
import ProjetMS.Client.Proxies.MSUsersProxy;
import ProjetMS.Client.Model.Auteur;
import ProjetMS.Client.Model.Categorie;
import ProjetMS.Client.Model.Commentaire;
import ProjetMS.Client.Model.Article;
import ProjetMS.Client.Proxies.ArticleProxy;
import ProjetMS.Client.Proxies.AuteurProxy;
import ProjetMS.Client.Proxies.CategorieProxy;
import ProjetMS.Client.Proxies.CommentaireProxy;

@Controller
public class HomeController {
	
	@RequestMapping("/Home")
	public String home(Model model){
	    return "Home";
	}
	 
	
	@Autowired
	private CategorieProxy CategorieProxy;
	
	@Autowired
	private AuteurProxy AuteurProxy;
	
	@Autowired
	private CommentaireProxy CommentaireProxy;
		
	@Autowired
	private ArticleProxy ArticleProxy;
	
	
		
	@PostMapping(value="/auteur/login")
	public boolean login(@RequestBody Auteur a) {
		return AuteurProxy.login(a);
	}
		
	@PostMapping(value="/auteur/add")
	public void addAuteur(@RequestBody Auteur a) {
		AuteurProxy.addAuteur(a);
	}
		
	@GetMapping(value="/categorie")
	public List<Categorie> getCategories(){
		return CategorieProxy.getCategories();
	}
	
	@PostMapping(value="/categorie/add")
	public void addCategorie(@RequestBody Categorie c) {
		CategorieProxy.addCategorie(c);
	}
		
		
	/*@GetMapping(value="/comment/{auteur}")
	public Commentaire getCommentaire(@PathVariable String auteur) {
		return CommentaireProxy.getCommentaire(auteur);
	}*/
		
	@GetMapping(value="/comments")
	public List<Commentaire> getCommentaires(){
		return CommentaireProxy.getCommentaires();
	}
		
	@PostMapping(value="/comments/add")
	public void addCommentaire(@RequestBody Commentaire c) {
		CommentaireProxy.addCommentaire(c);
	}

	
	@PostMapping(value="/articles/add")
	public void addArticle(@RequestBody Article a) {
		ArticleProxy.addArticle(a);
	}
}
