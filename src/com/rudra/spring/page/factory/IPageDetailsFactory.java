package com.rudra.spring.page.factory;

import com.rudra.spring.page.value.PageDetails;

public interface IPageDetailsFactory {
	public PageDetails getPageDetails(String pageName, String paneName);
}
