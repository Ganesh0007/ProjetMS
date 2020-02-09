package ProjetMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ProjetMS.model.User;
import ProjetMS.proxies.MSUserProxy;

@Controller
public class HomeController {
	 @Autowired
	 private MSUserProxy userProxy;

	 @RequestMapping("/test")
	 public String home(Model model){

		 List<User> users =  userProxy.getUsers();

		 model.addAttribute("users", users);

		 return "Home";
	 }
}
