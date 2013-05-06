package com.rudra.spring.page.value;

import java.util.ArrayList;
import java.util.List;

import com.rudra.spring.page.factory.MessageFactory;
import com.rudra.spring.page.pane.value.IEnumPage;

public class PageDetails implements IPageDetails{
	Message message;
	String url;
	IEnumPage[] sidePaneList ;
	
	MessageFactory factory ;
	
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	public String getPath() {
		return url;
	}
	public void setPath(String u) {
		url = u;
	}
	
	public void setSidePaneList(IEnumPage[] list) {
		sidePaneList = list;
	}
	
	public IEnumPage[] getSidePaneList() {
		return sidePaneList;
	}

	
	
}
