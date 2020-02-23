package ProjetMS.Client.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ProjetMS.Client.Model.User; 
import ProjetMS.Client.Proxies.MSUsersProxy;

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
		

}
