using weather_app;
using WeatherApp.Interfaces;

Console.WriteLine("Hello from weather-app!");

IObserver observer = new WeatherObserver();
IObserver observer2 = new WeatherObserver();
WeatherForecaster forecaster = new WeatherForecaster(new List<IObserver> { observer, observer2 });
forecaster.GetTemperature();