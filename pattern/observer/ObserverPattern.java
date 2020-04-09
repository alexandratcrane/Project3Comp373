package pattern.observer;

public class ObserverPattern {
	public static void main (String args[]) {
		Youtube bdressed = new Youtube("Bestdressed");
		
		Subscriber s1 = new Subscriber();
		Subscriber s2 = new Subscriber();
		Subscriber s3 = new Subscriber();
		
		bdressed.regsiterObserver(s1);
		bdressed.regsiterObserver(s2);
		bdressed.regsiterObserver(s3);
		
		bdressed.notifyObservers();
		
		System.out.println("*____________________________________________________________________*");
		Youtube anon = new Youtube();
		anon.regsiterObserver(s2);
		anon.regsiterObserver(s3);
		anon.notifyObservers();
		
	}
}
