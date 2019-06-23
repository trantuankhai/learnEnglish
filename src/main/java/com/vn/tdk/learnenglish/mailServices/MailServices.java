package com.vn.tdk.learnenglish.mailServices;

import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

import com.vn.tdk.learnenglish.util.Status;

@Service
public class MailServices {
	private static final String PASS_WORD = "trantuankhai1";
	private static final String FROM = "khaittph05424@fpt.edu.vn";

	public String sendMail(String emailAddress, Integer id_account) {
		try {
			setContent(emailAddress, id_account);
		} catch (MessagingException e) {
			e.printStackTrace();
			return Status.ERROR;
		}
		return Status.SUCCESS;
	}

	private void setContent(String to, Integer id_acount) throws MessagingException, AddressException {
		StringBuilder content = new StringBuilder();
						content.append("<h2>Wellcome</h2>");
						content.append("<p>Thannk for signup platform learn english.</p>");
						content.append("<p>Please follow <a href = \"https://localhost:8010/acount/active/"+id_acount+"\">link </a> to active account </p>");
						content.append("Thanks.");
		
		Session session = Session.getInstance(configProperties(), new javax.mail.Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(FROM, PASS_WORD);
			}
		});
		Message msg = new MimeMessage(session);
		// -- Set the FROM and TO fields --
		msg.setFrom(new InternetAddress(FROM));
		msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to, false));
		msg.setSubject("LEARN ENGLISH ONLINE ACTIVE USER");
		msg.setContent(content.toString(), "text/html;charset=UTF-8");
		Transport.send(msg);
	}

	private Properties configProperties() {
		final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
		Properties props = new Properties();
		props.setProperty("mail.smtp.host", "smtp.gmail.com");
		props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
		props.setProperty("mail.smtp.socketFactory.fallback", "false");
		props.setProperty("mail.smtp.port", "465");
		props.setProperty("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.auth", "true");
		props.put("mail.debug", "true");
		props.put("mail.store.protocol", "pop3");
		props.put("mail.transport.protocol", "smtp");
		return props;
	}

}
