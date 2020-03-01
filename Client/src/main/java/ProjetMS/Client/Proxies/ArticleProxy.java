package ProjetMS.Client.Proxies;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ProjetMS.Client.Model.Article;

@FeignClient(name="DeltaAPIArticle")
@RibbonClient(name= "DeltaAPIArticle")
public interface ArticleProxy {
	
	@PostMapping(value="/add")
	public void addArticle(@RequestBody Article a);
	
	
	@GetMapping(value="/articles/{id}")
	public Article getArticle(@PathVariable Long id);
	
	@GetMapping(value="/articles")
	public List<Article> getArticles();
	
	@PostMapping(value="/articles")
	public List<Article> getArticlesByCategorie(@RequestBody String categorie);
	
}
