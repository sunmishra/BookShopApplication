package sh.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sh.entities.Customer;
import sh.models.Login;
import sh.services.CustomerService;

@Controller//FC only searches classes with @Controller
public class LoginControllerImpl {
	
	@Autowired
	private CustomerService custService;
	
	@RequestMapping("/index")
	public String index(Model model) {		
		model.addAttribute("command",new Login());
		return "index";		
	}
	
	
	@RequestMapping("/auth")
	public String authenticate(Login l, HttpSession session) {  
										 
		Customer cust = custService.findCustomer(l.getEmail(), l.getPassword());
		if(cust != null) {
			session.setAttribute("customer", cust);
			session.setAttribute("cart", new ArrayList<Integer>());//if login is successful give user an empty cart
			return "redirect:getsubjects";// OR forward:getsubjects if we write only return "subjects" it will have goto subjects which show only empty view
		}//since after login is successful we want to show page having some data in it thats why we've to forward it via BC fetching sub names
		else
			return "failed";
	}
	
	@RequestMapping("/logout")
	public String signOut(HttpSession session) {
		session.invalidate();
		return "logout";
	}
	
}
