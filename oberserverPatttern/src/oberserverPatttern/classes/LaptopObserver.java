package oberserverPatttern.classes;

import oberserverPatttern.interfaces.ObservableInterface;
import oberserverPatttern.interfaces.ObserverInterface;

public class LaptopObserver implements ObserverInterface {

	private String name;
	private ObservableInterface interfaceObj;

	public LaptopObserver(ObservableInterface obj, String name) {
		this.interfaceObj = obj;
		this.name = name;
	}

	@Override
	public void update() {
		System.out.println("Laptops are again in stock, Mr. "+ name);

	}

}
