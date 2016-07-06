package com.rudra.mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.rudra.db.mongo.DbProvider;
import com.rudra.spring3.data.User;
import com.rudra.spring3.form.ContactFrom;

public class MailSenderImpl implements MaiLSender {

	private static MailSenderImpl instance = new MailSenderImpl();

	public static MailSenderImpl getMailSender() {
		return instance;
	}

	@Override
	public void sendMail(ContactFrom contactForm) {
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		try {
			DB mongodb = DbProvider.getInstance().getDB();
			Gson gson = new Gson();
			DBCollection collection = mongodb.getCollection("users");

			BasicDBObject whereQuery = new BasicDBObject();
			whereQuery.put("username", "wemabharati@gmail.com");
			DBObject dbObject = collection.findOne(whereQuery);
			final User userJson = gson
					.fromJson(dbObject.toString(), User.class);

			Session session = Session.getDefaultInstance(props,
					new javax.mail.Authenticator() {
						protected PasswordAuthentication getPasswordAuthentication() {
							return new PasswordAuthentication(userJson
									.getUsername(), getPassword(userJson));
						}
					});

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("wemabharati@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(contactForm.getEmail()));
			message.setSubject("Thank you");
			message.setText("Dear "
					+ contactForm.getFirstName()
					+ ",\n\nThank you for contacting Us.\nWe are looking at your communication and we will get back to you shortly.\n\n Warm regards,\nMa Bharati Team");

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}

	private String getPassword(User user) {
		CryptoUtil cryptoUtil = new CryptoUtil();
		String plainAfter = "";
		try {
			plainAfter = cryptoUtil.decrypt(user.getKey(), user.getPassword());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return plainAfter;

	}

}
