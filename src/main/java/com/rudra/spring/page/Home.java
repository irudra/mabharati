package com.rudra.spring.page;

import java.util.List;

public class Home {

	String title;
	List<Carousel> carousels;
	HomeMenu homeMenu;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Carousel> getCarousels() {
		return carousels;
	}
	public void setCarousels(List<Carousel> carousel) {
		this.carousels = carousel;
	}
	public HomeMenu getHomeMenu() {
		return homeMenu;
	}
	public void setHomeMenu(HomeMenu homeMenu) {
		this.homeMenu = homeMenu;
	}
}
