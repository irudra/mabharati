package com.rudra.spring.page;

import java.util.List;

public class HomeMenu {

	private String heading;
	private String text;
	List<Thumbnail> thumbnails;
	public String getHeading() {
		return heading;
	}
	public void setHeading(String heading) {
		this.heading = heading;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public List<Thumbnail> getThumbnails() {
		return thumbnails;
	}
	public void setThumbnails(List<Thumbnail> thumbnails) {
		this.thumbnails = thumbnails;
	}
}
