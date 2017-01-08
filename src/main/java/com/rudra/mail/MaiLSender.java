package com.rudra.mail;

import com.rudra.spring3.form.ContactFrom;

public interface MaiLSender {

	void sendMail(ContactFrom contactForm);
}
