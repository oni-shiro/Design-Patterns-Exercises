package oberserverPatttern.classes;

import java.util.ArrayList;
import java.util.List;

import oberserverPatttern.interfaces.ObservableInterface;
import oberserverPatttern.interfaces.ObserverInterface;

public class StockObservableImpl implements ObservableInterface{
	private int stockCount = 0;
	private List<ObserverInterface> observerList = new ArrayList<>();
	public void demo() {
		
	}
	@Override
	public void setNewStock(int newStock) {
		if(stockCount == 0) notifyObserver();
		stockCount += newStock;
	}

	@Override
	public void addObserver(ObserverInterface obj) {
		observerList.add(obj);
		
	}

	@Override
	public void removeObserver(ObserverInterface obj) {
		observerList.remove(obj);
		
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(ObserverInterface observer : observerList) {
			observer.update();
		}
		
	}

	

}
