package net.codejava.spring.controller;

import net.codejava.spring.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/register")
public class RegisterController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView viewRegistration(HttpServletRequest request, HttpServletResponse response) {
		User userForm = new User();
		Map<String, Object> model = new HashMap<>();
		model.put("userForm", userForm);
		
		return new ModelAndView("Registration", "userForm", userForm);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView processRegistration(HttpServletRequest request, HttpServletResponse response,
											@ModelAttribute("userForm") User user) {
		return new ModelAndView("RegistrationSuccess", "userForm", user);
	}
}
