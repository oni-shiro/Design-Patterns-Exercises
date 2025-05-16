using WeatherApp.Interfaces;

public interface IObservable
{
    void NotifyObservers();
    void RegisterObserver(IObserver observer);
    void RemoveObserver(IObserver observer);
    void GetTemperature();
}