package com.rudra.spring.page.pane.value;

public enum EnumAboutUs implements IEnumPage{
	INTIALSPARK("intial","The Intial Spark"),
	VISION("vision", "Vision"),
	OURFAMILY("family", "Our Family"),
	OURPRIORITIES("priorities", "Our priorities");
	private String name ;
	private String value;
	private EnumAboutUs(String n, String v) {
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
