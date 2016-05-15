package com.rudra.spring3.persistence.mongo;

import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
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
		MongoClient mongo =null;
		logger.info("getting events from mongo db");
		try {
			mongo = new MongoClient( "localhost" , 27017 );
		} catch (UnknownHostException e) {
			logger.error("Error while getting connection with mongo db");
		}
		DB mongodb =mongo.getDB("rudra");
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
