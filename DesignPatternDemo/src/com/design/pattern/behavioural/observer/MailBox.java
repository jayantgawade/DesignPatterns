package com.design.pattern.behavioural.observer;

public class MailBox implements Observer {

	private String prodcut;
	
	public void setProdcut(String prodcut) {
		this.prodcut = prodcut;
	}
	public void update() {
		System.out.println("Congrats your product " + prodcut + " is now available");
	}
	public String getProdcut() {
		// TODO Auto-generated method stub
		return prodcut;
	}

}
