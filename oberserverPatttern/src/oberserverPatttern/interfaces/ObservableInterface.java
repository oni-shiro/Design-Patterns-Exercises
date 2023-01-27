package oberserverPatttern.interfaces;

public interface ObservableInterface {
	
	void addObserver(ObserverInterface obj);
	void removeObserver(ObserverInterface obj);
	void notifyObserver();
	void setNewStock(int newStock);
	

}
