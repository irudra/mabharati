package com.rudra.db.mongo;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class DbProvider {
	private static DbProvider provider = new DbProvider();

	public static DbProvider getInstance() {
		return provider;
	}

	public DB getDB() {
		MongoClient mongoClient;
		try {
			mongoClient = new MongoClient("localhost", 27017);
			DB mongodb = mongoClient.getDB("rudra");
			return mongodb;
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
}
