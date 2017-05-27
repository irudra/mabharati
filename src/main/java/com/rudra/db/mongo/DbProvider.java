package com.rudra.db.mongo;

import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class DbProvider {
	private static DbProvider provider = new DbProvider();
	String host = System.getenv("OPENSHIFT_MONGODB_DB_HOST");
	String port = System.getenv("OPENSHIFT_MONGODB_DB_PORT");
	MongoClient mongo;
	Logger logger = LoggerFactory.getLogger(DbProvider.class);

	private DbProvider() {
		try {
			mongo = new MongoClient(host, Integer.valueOf(port));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static DbProvider getInstance() {
		return provider;
	}

	public DB getDB() {
		logger.info("getting events from mongo db");

		DB mongodb = mongo.getDB("jbossews");
		mongodb.authenticate("admin", "pyw-p7FvYC_v".toCharArray());
		return mongodb;

	}
}
