package com.rudra;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {

   @RequestMapping(value = "/index", method = RequestMethod.GET)
   public String index() {
	   return "index";
   }
   
   @RequestMapping(value = "/redirect", method = RequestMethod.GET)
   public String redirect() {
     
      return "redirect:final";
   }
   
   @RequestMapping(value = "/final", method = RequestMethod.GET)
   public String finalPage() {
     
      return "final";
   }
   
   @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
   public String redirect2() {
     
      return "redirect:/pages/final.html";
   }
}
