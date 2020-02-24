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
	
	 @Autowired
	 private MSUsersProxy userProxy;

	 @RequestMapping("/toto")
	 public String home(Model model){

		 List<User> users =  userProxy.getUsers();

	     model.addAttribute("users", users);

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
		
		@PostMapping(value="/login")
		public boolean login(@RequestBody Auteur a) {
			return AuteurProxy.login(a);
		}
		
		@PostMapping(value="/add")
		public void addAuteur(@RequestBody Auteur a) {
			AuteurProxy.addAuteur(a);
		}
		
		@PostMapping(value="/add")
		public void addCategorie(@RequestBody Categorie c) {
			CategorieProxy.addCategorie(c);
		}
		
		@GetMapping(value="/categorie")
		public List<Categorie> getCategories(){
			return CategorieProxy.getCategories();
		}
		
		@GetMapping(value="/comment/{auteur}")
		public Commentaire getCommentaire(@PathVariable String auteur) {
			return CommentaireProxy.getCommentaire(auteur);
		}
		
		@GetMapping(value="/comments")
		public List<Commentaire> getCommentaires(){
			return CommentaireProxy.getCommentaires();
		}
		
		@PostMapping(value="/add")
		public void addCommentaire(@RequestBody Commentaire c) {
			CommentaireProxy.addCommentaire(c);
		}
		

}
