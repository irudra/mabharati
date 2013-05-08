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
public class ContactController {

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
        return new ModelAndView("body", "pagedetails", factory.getPageDetails("aboutUS", null));
    }

    @RequestMapping(value = "/ourWork", method = RequestMethod.GET)
    public ModelAndView showOurWork() {
        System.out.println("in page ");
        return new ModelAndView("body", "pagedetails", factory.getPageDetails("ourWork", null));
    }

    @RequestMapping(value = "/thankYou", method = RequestMethod.GET)
    public ModelAndView showThankYou() {
        System.out.println("in page ");
        return new ModelAndView("body", "pagedetails", factory.getPageDetails("thankYou", null));
    }

    @RequestMapping(value = "/contactUs", method = RequestMethod.GET)
    public ModelAndView showContactUs() {
        System.out.println("in page ");
        return new ModelAndView("body", "pagedetails", factory.getPageDetails("contactUs", null));
    }

    @RequestMapping(value = "/events", method = RequestMethod.GET)
    public ModelAndView showEvents() {
        System.out.println("in page ");
        return new ModelAndView("body", "pagedetails", factory.getPageDetails("events", null));
    }

    @RequestMapping(value = "/events/{sidePane}", method = RequestMethod.GET)
    public ModelAndView showEvents(@PathVariable(value = "sidePane") String sidePane) {
        System.out.println("page name-side pane-" + sidePane);
        return new ModelAndView("body", "pagedetails", factory.getPageDetails("events", sidePane));
    }

    @RequestMapping(value = "/ourWork/{sidePane}", method = RequestMethod.GET)
    public ModelAndView showOurWork(@PathVariable(value = "sidePane") String sidePane) {
        System.out.println("page name-side pane-" + sidePane);
        return new ModelAndView("body", "pagedetails", factory.getPageDetails("ourWork", sidePane));
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