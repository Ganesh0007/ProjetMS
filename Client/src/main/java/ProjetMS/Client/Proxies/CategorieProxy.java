package ProjetMS.Client.Proxies;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ProjetMS.Client.Model.Categorie;

@FeignClient(name="DeltaAPICategorie")
@RibbonClient(name="DeltaAPICategorie")

public interface CategorieProxy {
	
	@PostMapping(value="/add")
	public void addCategorie(@RequestBody Categorie c);
	
	@GetMapping(value="/categorie")
	public List<Categorie> getCategories();

}

