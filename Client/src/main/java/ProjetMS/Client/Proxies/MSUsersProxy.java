package ProjetMS.Client.Proxies;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import ProjetMS.Client.Model.User;

@FeignClient(name = "Client")
@RibbonClient(name= "Client")
public interface MSUsersProxy {

	@GetMapping(value = "/users")
	List<User> getUsers();
	
	@GetMapping( value = "/user/{id}")
	Optional<User> getUser(@PathVariable("id") Long id);
}
