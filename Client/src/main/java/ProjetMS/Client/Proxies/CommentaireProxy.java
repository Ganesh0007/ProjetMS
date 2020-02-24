package ProjetMS.Client.Proxies;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ProjetMS.Client.Model.Commentaire;

@FeignClient(name="DeltaAPICommentaire")
public class CommentaireProxy {
	
	@GetMapping(value="/comment/{auteur}")
	public Commentaire getCommentaire(@PathVariable String auteur);
	
	@GetMapping(value="/comments")
	public List<Commentaire> getCommentaires();
	
	@PostMapping(value="/add")
	public void addCommentaire(@RequestBody Commentaire c);
}
