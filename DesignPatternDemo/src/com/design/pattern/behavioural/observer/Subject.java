package com.design.pattern.behavioural.observer;

public interface Subject {

	public void addObserver(Observer o);
	public void removeObserver(Observer o);
	void notifyObservers();
	
	
}
