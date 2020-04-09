package pattern.observer;

public class Subscriber implements Observer {
	String s;
	
	@Override
	public void update(String s) {
		this.s = s;
		System.out.println(s + " just uploaded a new video!");

	}

}
