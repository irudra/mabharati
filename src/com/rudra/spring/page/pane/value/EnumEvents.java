package com.rudra.spring.page.pane.value;

public enum EnumEvents implements IEnumPage{
	CURRENTEVENTS("currentevents","Current Events"),
	PLANNEDEVENTS("plannedevents", "planned Events"),
	HISTORY("history", "Events History"),
	SUGGESTUS("suggestus", "Suggests Us");
	private String name ;
	private String value;
	private EnumEvents(String n, String v) {
		setName(n);
		setValue(v);
	}
	@Override
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
