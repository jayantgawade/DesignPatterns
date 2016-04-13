package com.design.pattern.behavioural.observer;

import java.util.ArrayList;

public class PostOffice implements Subject {

	private String address;
	private ArrayList<Observer> observers;

	public PostOffice(String address) {
		super();
		this.address = address;
		this.observers = new ArrayList<Observer>();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void newEmai() {

		notifyObservers();
	}

	public void addObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	public void notifyObservers() {

		for (int i = 0; i < observers.size(); i++) {

			if (observers.get(i).getProdcut().equals("2")) {
				observers.get(i).update();
			}
		}
	}

}
