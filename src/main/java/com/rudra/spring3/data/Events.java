package com.rudra.spring3.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Events {
List<Event> events = new ArrayList<>();

public List<Event> getEvents() {
	return Collections.unmodifiableList(events);
}

public void setEvents(List<Event> events) {
	this.events = events;
}
public void addEvents(Event event) {
	this.events.add(event);
}
}
