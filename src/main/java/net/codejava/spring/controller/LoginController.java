package net.codejava.spring.controller;

import net.codejava.spring.DAO.UserDao;
import net.codejava.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView viewLogin(HttpServletRequest request) {
        User userForm = new User();
        Map<String, Object> model = new HashMap<>();
        model.put("userForm", userForm);
        return new ModelAndView("Login", "userForm", userForm);
    }

    @RequestMapping(value = "/login/auth", method = RequestMethod.POST)
    public ModelAndView Logged(@ModelAttribute("userForm") User user,
                         HttpServletRequest request) {
        User userfromDB = userDao.findUserByUserName(user.getUsername());
        if (user.getUsername().equals("user") && user.getPassword().equals("haslo")) {
            request.getSession().setAttribute("username", user.getUsername());
            request.getSession().setAttribute("userType", user.getUserType().getUserType());
            return new ModelAndView("LoginSuccess");
        }
        return new ModelAndView("LoginFailed");
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public Map<String, Object> logout(HttpSession session) {
        session.invalidate();
        return null;
    }
}
