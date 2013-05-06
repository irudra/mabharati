package com.rudra.spring.page.factory;

import java.util.HashMap;
import java.util.Map;

import com.rudra.spring.page.pane.value.EnumAboutUs;
import com.rudra.spring.page.pane.value.EnumEvents;
import com.rudra.spring.page.pane.value.EnumOurWork;
import com.rudra.spring.page.pane.value.IEnumPage;
import com.rudra.spring.page.value.PageDetails;

public class PageDetailsFactory implements IPageDetailsFactory{
	
	MessageFactory factory;
	Map<String, IEnumPage[]> sidePaneList = new HashMap<String, IEnumPage[]>();
	
	private PageDetailsFactory(){
		setSidePaneDetails();
		factory = MessageFactory.getFactory();
	}
	
	private void setSidePaneDetails() {
		sidePaneList.put("aboutus", new EnumAboutUs[]{EnumAboutUs.INTIALSPARK,EnumAboutUs.OURFAMILY,
				EnumAboutUs.OURPRIORITIES, EnumAboutUs.VISION});
		sidePaneList.put("events", new EnumEvents[]{EnumEvents.CURRENTEVENTS,EnumEvents.PLANNEDEVENTS,
				EnumEvents.HISTORY, EnumEvents.SUGGESTUS});
		sidePaneList.put("ourwork", new EnumOurWork[]{EnumOurWork.EDUCATION,EnumOurWork.SELFHELP,
				EnumOurWork.GAUPROTECTION, EnumOurWork.SOCIALCONCERN, EnumOurWork.HOWWE,
				EnumOurWork.BEWITHUS, EnumOurWork.SUGGESTION});
	}

	public static PageDetailsFactory getFactory(){
		return new PageDetailsFactory();
	}
	
	@Override
	public PageDetails getPageDetails(String pageName, String sidePane){
		PageDetails pageDetails = new PageDetails();
		pageDetails.setPath(pageName);
		pageName = pageName.trim().toLowerCase();
		pageDetails.setMessage(factory.getMessage(pageName,sidePane));
		pageDetails.setSidePaneList(sidePaneList.get(pageName));
		return pageDetails;
		
	}
}
