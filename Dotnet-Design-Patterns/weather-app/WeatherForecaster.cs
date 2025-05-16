using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using WeatherApp.Interfaces;

namespace weather_app;

public class WeatherForecaster : IObservable
{
    private List<IObserver> _observers = new List<IObserver>();

    private float _temperature;

    public WeatherForecaster(List<IObserver> observers)
    {
        _observers = observers;
    }

    public void GetTemperature()
    {
        float prevTemp = _temperature;
        _temperature = Random.Shared.Next(0, 40); // Simulating temperature
        if(Math.Abs(_temperature - prevTemp) > 2f)
        {
            NotifyObservers();
        }
    }

    public void NotifyObservers()
    {
        _observers.ForEach(observer => observer.ShowTemp(_temperature));
    }

    public void RegisterObserver(IObserver observer)
    {
        _observers.Add(observer);
    }

    public void RemoveObserver(IObserver observer)
    {
        _observers.Remove(observer);
    }
}