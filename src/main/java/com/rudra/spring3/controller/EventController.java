package com.rudra.spring3.controller;

import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;
import com.rudra.spring.page.factory.IPageDetailsFactory;
import com.rudra.spring.page.factory.PageDetailsFactory;
import com.rudra.spring.page.pane.value.EnumEvents;
import com.rudra.spring.page.value.Message;
import com.rudra.spring3.data.Event;
import com.rudra.spring3.data.Events;
import com.rudra.spring3.persistence.mongo.DataProvider;
import com.rudra.spring3.persistence.mongo.EventsProvider;

@Controller
@SessionAttributes
public class EventController {

	Logger logger = LoggerFactory.getLogger(EventsProvider.class);
    IPageDetailsFactory factory = PageDetailsFactory.getFactory();
    Message message = new Message();

    @RequestMapping(value = "/events", method = RequestMethod.GET)
    public ModelAndView showEvents() {
        System.out.println("in page ");
        return new ModelAndView("events", "pagedetails", factory.getPageDetails("events", null));
    }

    @RequestMapping(value = "/events/{sidePane}", method = RequestMethod.GET)
    public ModelAndView showEvents(@PathVariable(value = "sidePane") String sidePane) {
        System.out.println("page name-side pane-" + sidePane);
        DataProvider<Events> dataProvider = EventsProvider.getInstance();
        if(EnumEvents.SUGGESTUS.getName().equalsIgnoreCase(sidePane)){
        	return new ModelAndView("addevents", "pagedetails", factory.getPageDetails("events", null));
        }
        return new ModelAndView("eventTable", "events", dataProvider.getData());
    }
    
    @RequestMapping(value = "/addEvent",method = RequestMethod.GET )
    @ResponseBody
    public ModelAndView addEvent(String json) {
        Gson gson = new Gson();
        Event event =gson.fromJson(json, Event.class);
        event.set_id(event.getHeader());
        System.out.print(event.getEventUser());

        MongoClient mongoClient;
        try {
        	mongoClient = new MongoClient( "localhost" , 27017 );
		
		DB mongodb =mongoClient.getDB("rudra");
		
		DBCollection collection= mongodb.getCollection("Events");
		collection.insert((BasicDBObject) JSON.parse(gson.toJson(event)));
        } catch (UnknownHostException e) {
			logger.error("Error while getting connection with mongo db");
		}
        return new ModelAndView("success", "", null);
    }

}