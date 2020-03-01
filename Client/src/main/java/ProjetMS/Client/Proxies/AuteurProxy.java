package ProjetMS.Client.Proxies;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ProjetMS.Client.Model.Auteur;

@FeignClient(name="DeltaAPIAuteur")
@RibbonClient(name= "DeltaAPIAuteur")
public interface AuteurProxy {
	
	@PostMapping(value="/login")
	public boolean login(@RequestBody Auteur a);
	
	@PostMapping(value="/add")
	public void addAuteur(@RequestBody Auteur a);

	public boolean existUsername(String username);
}
