package com.rudra.spring3.persistence.mongo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.rudra.db.mongo.DbProvider;
import com.rudra.spring3.data.Event;
import com.rudra.spring3.data.Events;

public class EventsProvider implements DataProvider<Events> {

	private static EventsProvider instance= new EventsProvider();
	
	public static EventsProvider getInstance(){
		return instance;
	}
	
	private EventsProvider(){
		
	}
	
	Logger logger = LoggerFactory.getLogger(EventsProvider.class);
	
	@Override
	public Events getData() {
		Events events = new Events();
		
		Gson gson = new Gson();
		DB mongodb = DbProvider.getInstance().getDB();
		DBCollection collection= mongodb.getCollection("Events");

		DBCursor cursorDocJSON = collection.find();
		while (cursorDocJSON.hasNext()) {
			DBObject dbObjectjso =cursorDocJSON.next();
			Event eventFromJson =gson.fromJson(dbObjectjso.toString(), Event.class);
			events.addEvents(eventFromJson);
		}
		return events;
	}

}
