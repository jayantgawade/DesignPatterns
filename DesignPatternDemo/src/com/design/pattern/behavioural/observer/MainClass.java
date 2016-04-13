package com.design.pattern.behavioural.observer;

public class MainClass {

	public static void main(String[] args) {
		MailBox mailBox1 = new MailBox();
		mailBox1.setProdcut("1");
		MailBox mailBox2 = new MailBox();
		mailBox2.setProdcut("2");
		PostOffice office = new PostOffice("Address 123");
		
		office.addObserver(mailBox1);
		office.addObserver(mailBox2);
		office.newEmai();
		office.removeObserver(mailBox1);
	}

}
