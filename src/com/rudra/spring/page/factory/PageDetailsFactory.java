package com.rudra.spring.page.factory;

import java.util.HashMap;
import java.util.Map;

import com.rudra.spring.page.pane.value.EnumAboutUs;
import com.rudra.spring.page.pane.value.EnumEvents;
import com.rudra.spring.page.pane.value.EnumOurWork;
import com.rudra.spring.page.pane.value.HeaderMenu;
import com.rudra.spring.page.pane.value.IEnumPage;
import com.rudra.spring.page.value.PageDetails;
import java.util.ArrayList;
import java.util.List;

public class PageDetailsFactory implements IPageDetailsFactory {

    MessageFactory factory;
    Map<String, IEnumPage[]> sidePaneList = new HashMap<String, IEnumPage[]>();
    List<HeaderMenu> headerList = new ArrayList<HeaderMenu>();

    private PageDetailsFactory() {
        setSidePaneDetails();
        setHeaderList();
        factory = MessageFactory.getFactory();
    }

    private void setSidePaneDetails() {
        sidePaneList.put("aboutus", new EnumAboutUs[]{EnumAboutUs.INTIALSPARK, EnumAboutUs.OURFAMILY,
            EnumAboutUs.OURPRIORITIES, EnumAboutUs.VISION});
        sidePaneList.put("events", new EnumEvents[]{EnumEvents.CURRENTEVENTS, EnumEvents.PLANNEDEVENTS,
            EnumEvents.HISTORY, EnumEvents.SUGGESTUS});
        sidePaneList.put("ourwork", new EnumOurWork[]{EnumOurWork.EDUCATION, EnumOurWork.SELFHELP,
            EnumOurWork.GAUPROTECTION, EnumOurWork.SOCIALCONCERN, EnumOurWork.HOWWE,
            EnumOurWork.BEWITHUS, EnumOurWork.SUGGESTION});
    }

    public static PageDetailsFactory getFactory() {
        return new PageDetailsFactory();
    }

    @Override
    public PageDetails getPageDetails(String pageName, String sidePane) {
        PageDetails pageDetails = new PageDetails();
        pageDetails.setPath(pageName);
        pageName = pageName.trim().toLowerCase();
        pageDetails.setMessage(factory.getMessage(pageName, sidePane));
        pageDetails.setSidePaneList(sidePaneList.get(pageName));
        pageDetails.setHeaderList(headerList);
        return pageDetails;

    }

    private void setHeaderList() {
        headerList.add(new HeaderMenu("home", "Home"));
        headerList.add(new HeaderMenu("aboutUS", "About US"));
        headerList.add(new HeaderMenu("events", "Events"));
        headerList.add(new HeaderMenu("ourWork", "Our Work"));
        headerList.add(new HeaderMenu("thankYou", "Thank You"));
        headerList.add(new HeaderMenu("contactUs", "Contact Us"));
    }
}
