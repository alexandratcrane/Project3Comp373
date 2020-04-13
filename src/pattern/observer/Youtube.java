package pattern.observer;

import java.util.*;

public class Youtube implements Subject {
	String name;
	ArrayList<Observer> array;
	
	
	//constructors
	public Youtube(String name) {
		this.name = name;
		array = new ArrayList<>();
	}
	
	public Youtube() {
		name = "A youtuber you subscribed to";
		array = new ArrayList<>();
	}
	
	
	
	@Override
	public void regsiterObserver(Observer o) {
		array.add(o);

	}

	@Override
	public void unregisterObserver(Observer o) {
		array.remove(o);

	}

	@Override
	public void notifyObservers() {
		Iterator<Observer> it = array.iterator();
		while(it.hasNext()) {
			Observer o = it.next();
			o.update(name);
			
		}

	}

}
