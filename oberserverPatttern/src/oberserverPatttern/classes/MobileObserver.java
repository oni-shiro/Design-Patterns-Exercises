package oberserverPatttern.classes;

import oberserverPatttern.interfaces.ObservableInterface;
import oberserverPatttern.interfaces.ObserverInterface;

public class MobileObserver implements ObserverInterface {
	private String name;
	private ObservableInterface interfaceObj;

	public MobileObserver(ObservableInterface obj, String name) {
		this.interfaceObj = obj;
		this.name = name;
	}

	@Override
	public void update() {
		System.out.println("Mobiles are back in stock Mr. "+ name);

	}

}
