package pattern.observer;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAll {
	ArrayList<Observer> array;
	private static Youtube bdressed = new Youtube("Bestdressed");
	private static String name;
	Youtube anon = new Youtube();
	Subscriber s1 = new Subscriber();
	Subscriber s2 = new Subscriber();
	Subscriber s3 = new Subscriber();

	
	
	//Tests to see if the subscribers were able to subscribe and be notified of a new video upload
	@Test
	public void testRegisterAndNotifyObservers() {
		
		
		bdressed.regsiterObserver(s1);
		bdressed.regsiterObserver(s2);
		bdressed.regsiterObserver(s3);
		bdressed.notifyObservers();
		assertEquals(3, bdressed.array.size());
	}
	
	//Tests to see if subscribers are can be notified of an anonymous upload from someone on their subscription list
	@Test
	public void testRegisterAndNotifyAnonymous() {
		anon.regsiterObserver(s2);
		anon.regsiterObserver(s3);
		anon.notifyObservers();
		assertEquals(2, anon.array.size());
		
	}
	

	


}
