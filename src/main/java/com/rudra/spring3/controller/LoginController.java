package com.rudra.spring3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PathVariable;

import com.rudra.spring.page.factory.IPageDetailsFactory;
import com.rudra.spring.page.factory.PageDetailsFactory;
import com.rudra.spring.page.value.Message;
import com.rudra.spring3.form.Contact;
import java.security.Principal;
import org.springframework.ui.ModelMap;

@Controller
@SessionAttributes
public class LoginController {

    IPageDetailsFactory factory = PageDetailsFactory.getFactory();
    Message message = new Message();

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login() {
        return new ModelAndView("login");
    }

    @RequestMapping(value = "/loginfailed", method = RequestMethod.GET)
    public String loginerror(ModelMap model) {

        model.addAttribute("error", "true");
        return "login";

    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(ModelMap model) {

        return "login";
    }
}