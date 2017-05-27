package com.rudra.spring3.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.rudra.mail.MaiLSender;
import com.rudra.mail.MailSenderImpl;
import com.rudra.spring.page.AboutUs;
import com.rudra.spring.page.Carousel;
import com.rudra.spring.page.Home;
import com.rudra.spring.page.HomeMenu;
import com.rudra.spring.page.Thumbnail;
import com.rudra.spring.page.factory.IPageDetailsFactory;
import com.rudra.spring.page.factory.PageDetailsFactory;
import com.rudra.spring.page.value.Message;
import com.rudra.spring.page.value.PageDetails;
import com.rudra.spring3.form.Contact;
import com.rudra.spring3.form.ContactFrom;
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
        Home home = new Home();
        home.setTitle("Ma Bharati");
        HomeMenu homeMenu = new HomeMenu();
        homeMenu.setHeading("Our contribution to the world");
        homeMenu.setText("We want to make the world a better place.<br> What you want to do for the society!");
        List<Thumbnail> thumbnails = new ArrayList<>();
        Thumbnail thumbnail1 = new Thumbnail();
        thumbnail1.setImageSource("https://raw.githubusercontent.com/rudralife/mabharati/UIchangeslocal/src/main/webapp/res/image/Story4.jpg");
        thumbnail1.setHeading("Know us");
        thumbnail1.setCaption("We are you to <br> help you.<br><br>");
        thumbnail1.setLink("/aboutUS");
        thumbnail1.setLinkCaption("About us");
        Thumbnail thumbnail2 = new Thumbnail();
        thumbnail2.setImageSource("https://raw.githubusercontent.com/rudralife/mabharati/UIchangeslocal/src/main/webapp/res/image/Story4.jpg");
        thumbnail2.setHeading("What we do");
        thumbnail2.setCaption("We work to make <br>this world a better place<br><br>");
        thumbnail2.setLink("/ourWork");
        thumbnail2.setLinkCaption("Our work");
        Thumbnail thumbnail3 = new Thumbnail();
        thumbnail3.setImageSource("https://raw.githubusercontent.com/rudralife/mabharati/UIchangeslocal/src/main/webapp/res/image/Story4.jpg");
        thumbnail3.setHeading("Events");
        thumbnail3.setCaption("We are continuously working to make this world a better place. Find out what is the next challenge we have.");
        thumbnail3.setLink("/events");
        thumbnail3.setLinkCaption("Events");
        thumbnails.add(thumbnail1);
        thumbnails.add(thumbnail2);
        thumbnails.add(thumbnail3);
        homeMenu.setThumbnails(thumbnails);
        Carousel carousel = new Carousel();
        carousel.setImageLink("https://raw.githubusercontent.com/rudralife/mabharati/UIchangeslocal/src/main/webapp/res/image/Story4.jpg");
        carousel.setImageAlt("Help");
        carousel.setHeading("Help");
        carousel.setMessage("Helping others is the best way to help yourself.");
        Carousel carousel2 = new Carousel();
        carousel2.setImageLink("https://raw.githubusercontent.com/rudralife/mabharati/UIchangeslocal/src/main/webapp/res/image/village.jpg");
        carousel2.setImageAlt("Rebuild");
        carousel2.setHeading("Rebuild");
        carousel2.setMessage("Help villages to help Uttarakhand !");
        Carousel carousel3 = new Carousel();
        carousel3.setImageLink("https://raw.githubusercontent.com/rudralife/mabharati/UIchangeslocal/src/main/webapp/res/image/children.jpg");
        carousel3.setImageAlt("Education");
        carousel3.setHeading("Education");
        carousel3.setMessage("Every child gets education is your aim.");
        final List<Carousel> carousels = new ArrayList<>(3);
        carousels.add(carousel);
        carousels.add(carousel2);
        carousels.add(carousel3);
        home.setCarousels(carousels);
        home.setHomeMenu(homeMenu);
        PageDetails details = factory.getPageDetails("home", null);
        details.setPage(home);
        return new ModelAndView("home", "pagedetails", details);
    }
    
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView showHome() {
        Home home = new Home();
        home.setTitle("Ma Bharati");
        HomeMenu homeMenu = new HomeMenu();
        homeMenu.setHeading("Our contribution to the world");
        homeMenu.setText("We want to make the world a better place.<br> What you want to do for the society!");
        List<Thumbnail> thumbnails = new ArrayList<>();
        Thumbnail thumbnail1 = new Thumbnail();
        thumbnail1.setImageSource("https://raw.githubusercontent.com/rudralife/mabharati/UIchangeslocal/src/main/webapp/res/image/Story4.jpg");
        thumbnail1.setHeading("Know us");
        thumbnail1.setCaption("We are you to <br> help you.<br><br>");
        thumbnail1.setLink("/aboutUS");
        thumbnail1.setLinkCaption("About us");
        Thumbnail thumbnail2 = new Thumbnail();
        thumbnail2.setImageSource("https://raw.githubusercontent.com/rudralife/mabharati/UIchangeslocal/src/main/webapp/res/image/Story4.jpg");
        thumbnail2.setHeading("What we do");
        thumbnail2.setCaption("We work to make <br>this world a better place<br><br>");
        thumbnail2.setLink("/ourWork");
        thumbnail2.setLinkCaption("Our work");
        Thumbnail thumbnail3 = new Thumbnail();
        thumbnail3.setImageSource("https://raw.githubusercontent.com/rudralife/mabharati/UIchangeslocal/src/main/webapp/res/image/Story4.jpg");
        thumbnail3.setHeading("Events");
        thumbnail3.setCaption("We are continuously working to make this world a better place. Find out what is the next challenge we have.");
        thumbnail3.setLink("/events");
        thumbnail3.setLinkCaption("Events");
        thumbnails.add(thumbnail1);
        thumbnails.add(thumbnail2);
        thumbnails.add(thumbnail3);
        homeMenu.setThumbnails(thumbnails);
        Carousel carousel = new Carousel();
        carousel.setImageLink("https://raw.githubusercontent.com/rudralife/mabharati/UIchangeslocal/src/main/webapp/res/image/Story4.jpg");
        carousel.setImageAlt("Help");
        carousel.setHeading("Help");
        carousel.setMessage("Helping others is the best way to help yourself.");
        Carousel carousel2 = new Carousel();
        carousel2.setImageLink("https://raw.githubusercontent.com/rudralife/mabharati/UIchangeslocal/src/main/webapp/res/image/village.jpg");
        carousel2.setImageAlt("Rebuild");
        carousel2.setHeading("Rebuild");
        carousel2.setMessage("Help villages to help Uttarakhand !");
        Carousel carousel3 = new Carousel();
        carousel3.setImageLink("https://raw.githubusercontent.com/rudralife/mabharati/UIchangeslocal/src/main/webapp/res/image/children.jpg");
        carousel3.setImageAlt("Education");
        carousel3.setHeading("Education");
        carousel3.setMessage("Every child gets education is your aim.");
        final List<Carousel> carousels = new ArrayList<>(3);
        carousels.add(carousel);
        carousels.add(carousel2);
        carousels.add(carousel3);
        home.setCarousels(carousels);
        home.setHomeMenu(homeMenu);
        PageDetails details = factory.getPageDetails("home", null);
        details.setPage(home);
        return new ModelAndView("home", "pagedetails", details);
    }

    @RequestMapping(value = "/aboutUS", method = RequestMethod.GET)
    public ModelAndView showAboutUS() {
    	AboutUs aboutUs = new AboutUs();
    	aboutUs.setHeading("ABOUT US");
    	aboutUs.setPic("https://raw.githubusercontent.com/rudralife/mabharati/UIchangeslocal/src/main/webapp/res/image/village.jpg");
    	aboutUs.setHtml("<h2>We Have Free Templates for Everyone</h2><p>Our website templates are created with inspiration, checked for quality and originality and meticulously sliced and coded. What's more, they're absolutely free! You can do a lot with them. You can modify them. You can use them to design websites for clients, so long as you agree with the </a>. You can even remove all our links if you want to.</p>	<h2>We Have More Templates for You</h2>	<p>	Looking for more templates? Just browse through all our >Free Website Templates</a> and find what you're looking for. But if you don't find any website template you can use, you can try our </a> service and tell us all about it. Maybe you're looking for something different, something special. And we love the challenge of doing something different and something special.</p><h2>Be Part of Our Community</h2><p>If you're experiencing issues and concerns about this website template, join the discussion on our forum</a> and meet other people in the community who share the same interests with you.</p><h2>Template details</h2><p>Design version 11. Code version 6.</p><p>Website Template details, discussion and updates for this Law Firm Web Template</a>.</p><p>Website Template design by Free Website Templates</a>.</p><p>Please feel free to remove some or all the text and links of this page and replace it with your own About content.</p>");
        System.out.println("in page ");
        PageDetails pageDetails= factory.getPageDetails("aboutUS", null);
        pageDetails.setPage(aboutUs);
        return new ModelAndView("aboutUS", "pagedetails", pageDetails);
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

    @RequestMapping(value = "/contactUs", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView showContactUs(String json) { 
    	Gson gson = new Gson();
    	ContactFrom form = gson.fromJson(json, ContactFrom.class);
    	MaiLSender sender = MailSenderImpl.getMailSender();
    	sender.sendMail(form);
        System.out.println("in page ++"+form.getFirstName());
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