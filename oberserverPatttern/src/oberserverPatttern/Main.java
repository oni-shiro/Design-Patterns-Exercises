package oberserverPatttern;

import oberserverPatttern.classes.LaptopObserver;
import oberserverPatttern.classes.MobileObserver;
import oberserverPatttern.classes.StockObservableImpl;
import oberserverPatttern.interfaces.ObservableInterface;
import oberserverPatttern.interfaces.ObserverInterface;

public class Main {
	public static void main(String[] args) {
		System.out.println("in Main");
		ObservableInterface observable = new StockObservableImpl();
		ObserverInterface laptopObserver = new LaptopObserver( observable, "Sinchan Saha");
		ObserverInterface mobileObserver = new MobileObserver(observable, "John Doe");
		observable.addObserver(mobileObserver);
		observable.addObserver(laptopObserver);
		observable.setNewStock(5);
		observable.setNewStock(10);
		observable.setNewStock(-15);
		observable.setNewStock(10);
	}
}
