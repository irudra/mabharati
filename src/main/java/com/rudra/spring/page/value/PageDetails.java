package com.rudra.spring.page.value;

import java.util.ArrayList;
import java.util.List;

import com.rudra.spring.page.factory.MessageFactory;
import com.rudra.spring.page.pane.value.HeaderMenu;
import com.rudra.spring.page.pane.value.IEnumPage;

public class PageDetails implements IPageDetails {

    Message message;
    String url;
    IEnumPage[] sidePaneList;
    MessageFactory factory;
    List<HeaderMenu> headerList = new ArrayList<HeaderMenu>();
    Object page;
    public Object getPage() {
		return page;
	}

	public void setPage(Object page) {
		this.page = page;
	}

	public List<HeaderMenu> getHeaderList() {
        return headerList;
    }

    public void setHeaderList(List<HeaderMenu> headerList) {
        this.headerList = headerList;
    }

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
