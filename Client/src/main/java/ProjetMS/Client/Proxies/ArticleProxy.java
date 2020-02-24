package ProjetMS.Client.Proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ProjetMS.Client.Model.Auteur;

@FeignClient(name="DeltaAPIArticle")
public class ArticleProxy {
	
	@PostMapping(value="/login")
	public boolean login(@RequestBody Article a);
	
	@PostMapping(value="/add")
	public void addArticle(@RequestBody Article a);

}
