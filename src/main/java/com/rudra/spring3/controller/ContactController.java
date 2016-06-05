package com.rudra.spring3.controller;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.rudra.spring.page.factory.IPageDetailsFactory;
import com.rudra.spring.page.factory.PageDetailsFactory;
import com.rudra.spring.page.value.Message;
import com.rudra.spring3.form.Contact;
import com.rudra.spring3.persistence.mongo.EventsProvider;

@Controller
@SessionAttributes
public class ContactController {

	Logger logger = LoggerFactory.getLogger(EventsProvider.class);
    IPageDetailsFactory factory = PageDetailsFactory.getFactory();
    Message message = new Message();
    
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public ModelAndView showWelcome(ModelMap model, Principal principal) {
        String name = principal.getName();
        model.addAttribute("username", name);
        model.addAttribute("login", "true");
        model.addAttribute("message", "Spring Security Custom Form example");
        System.out.println("in page ");
        return new ModelAndView("home", "pagedetails", factory.getPageDetails("home", null));
    }
    
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView showHome() {
        System.out.println("in page ");
        return new ModelAndView("home", "pagedetails", factory.getPageDetails("home", null));
    }

    @RequestMapping(value = "/aboutUS", method = RequestMethod.GET)
    public ModelAndView showAboutUS() {
        System.out.println("in page ");
        return new ModelAndView("aboutUS", "pagedetails", factory.getPageDetails("aboutUS", null));
    }

    @RequestMapping(value = "/ourWork", method = RequestMethod.GET)
    public ModelAndView showOurWork() {
        System.out.println("in page ");
        return new ModelAndView("ourWork", "pagedetails", factory.getPageDetails("ourWork", null));
    }

    @RequestMapping(value = "/thankYou", method = RequestMethod.GET)
    public ModelAndView showThankYou() {
        System.out.println("in page ");
        return new ModelAndView("thankYou", "pagedetails", factory.getPageDetails("thankYou", null));
    }

    @RequestMapping(value = "/contactUs", method = RequestMethod.GET)
    public ModelAndView showContactUs() { 
        System.out.println("in page ");
        return new ModelAndView("contactUs", "pagedetails", factory.getPageDetails("contactUs", null));
    }

    @RequestMapping(value = "/ourWork/{sidePane}", method = RequestMethod.GET)
    public ModelAndView showOurWork(@PathVariable(value = "sidePane") String sidePane) {
        System.out.println("page name-side pane-" + sidePane);
        return new ModelAndView("body", "pagedetails", factory.getPageDetails("ourWork", sidePane));
    }
    
    @RequestMapping(value = "/thankYou/{sidePane}", method = RequestMethod.GET)
    public ModelAndView showThankYou(@PathVariable(value = "sidePane") String sidePane) {
        System.out.println("page name-side pane-" + sidePane);
        return new ModelAndView("body", "pagedetails", factory.getPageDetails("ThankYou", sidePane));
    }

    @RequestMapping(value = "/aboutUS/{sidePane}", method = RequestMethod.GET)
    public ModelAndView showAboutUS2(@PathVariable(value = "sidePane") String sidePane) {
        System.out.println("page name-side pane-" + sidePane);
        return new ModelAndView("body", "pagedetails", factory.getPageDetails("aboutUS", sidePane));
    }

    @RequestMapping("/contacts3")
    public ModelAndView showContacts3() {
        System.out.println("First Name:");
        return new ModelAndView("contact3", "command", new Contact());
    }
}