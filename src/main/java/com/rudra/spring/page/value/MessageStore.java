/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rudra.spring.page.value;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hemant
 */
public class MessageStore {

    public MessageStore() {
        setPageList();
        setContactus(null);
        setAboutus(null);
        setEvents(null);
        setHomeList(null);
        setOurwork(null);
        setThankyou(null);
        
    }
    private Map<String, String> homeList = new HashMap<String, String>();
    private Map<String, String> aboutus = new HashMap<String, String>();
    private Map<String, String> contactus = new HashMap<String, String>();
    private Map<String, String> events = new HashMap<String, String>();
    private Map<String, String> ourwork = new HashMap<String, String>();
    private Map<String, String> thankyou = new HashMap<String, String>();
    private String message;
    private Map<String, Map> pageList = new HashMap<String, Map>();

    public void setPageList() {
        pageList.put("home", homeList);
        pageList.put("aboutus", aboutus);
        pageList.put("contactus", contactus);
        pageList.put("events", events);
        pageList.put("ourwork", ourwork);
        pageList.put("thankyou", thankyou);
    }

    public Map<String, String> getHomeList() {
        return homeList;
    }

    public Map<String, String> getAboutus() {
        return aboutus;
    }

    public Map<String, String> getContactus() {
        return contactus;
    }

    public Map<String, String> getEvents() {
        return events;
    }

    public Map<String, String> getOurwork() {
        return ourwork;
    }

    public Map<String, String> getThankyou() {
        return thankyou;
    }

    public void setHomeList(Map<String, String> homeList) {
        this.homeList = homeList;
    }

    private void setAboutus(Map<String, String> aboutus) {
        if (null != aboutus) {
            this.aboutus = aboutus;
        } else {
            this.aboutus.put("intial", "I am intial");
            this.aboutus.put("family", "I am our family");
            this.aboutus.put("priorities", "I am our priorities");
            this.aboutus.put("vision", "I am vision");
        }
    }
    
    public void setContactus(Map<String, String> contactus) {
        this.contactus = contactus;
    }

    public void setEvents(Map<String, String> events) {
        if (null != events) {
            this.events = events;
        } else {
            this.events.put("currentevents", "I am current event");
            this.events.put("plannedevents", "I am planned events");
            this.events.put("history", "I am our history");
            this.events.put("suggestus", "I am suggest us");
        }
    }

    public void setOurwork(Map<String, String> ourwork) {
        if (null != ourwork) {
            this.ourwork = ourwork;
        } else {
            this.ourwork.put("education", "I am education");
            this.ourwork.put("selfhelp", "I am self help");
            this.ourwork.put("gauprotection", "I am gau protection");
            this.ourwork.put("socialconcern", "I am social concern");
            this.ourwork.put("howwe", "I am how we");
            this.ourwork.put("bewithus", "I am be with us");
            this.ourwork.put("suggestion", "I am suggestion");
        }
    }

    public void setThankyou(Map<String, String> thankyou) {
    	this.thankyou.put("education", "I am education");
        this.thankyou.put("selfhelp", "I am self help");
        this.thankyou.put("gauprotection", "I am gau protection");
        this.thankyou.put("socialconcern", "I am social concern");
        this.thankyou.put("howwe", "I am how we");
        this.thankyou.put("bewithus", "I am be with us");
        this.thankyou.put("suggestion", "I am suggestion");
    }

    public String getMessage(String pageName, String paneName) {
        if (null != paneName) {
            return (String) pageList.get(pageName).get(paneName);
        } else if (!pageList.get(pageName).values().isEmpty()) {
            return (String) pageList.get(pageName).values().iterator().next();
        } else {
            return pageName;
        }
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
