package net.codejava.spring.controller;

import net.codejava.spring.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@RequestMapping(value = "/login")
public class RegisterController {

    @RequestMapping(method = RequestMethod.GET)
    public String viewRegistration(Map<String, Object> model) {

        return "Login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String Logged(@ModelAttribute("userForm") User user,
                                      Map<String, Object> model) {

        System.out.println("Login successful!");

        return "LoginSuccess";
    }
}
