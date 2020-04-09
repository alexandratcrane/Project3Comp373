package pattern.observer;

public interface Subject {
	public void regsiterObserver(Observer o);
	public void unregisterObserver(Observer o);
	public void notifyObservers();
}
