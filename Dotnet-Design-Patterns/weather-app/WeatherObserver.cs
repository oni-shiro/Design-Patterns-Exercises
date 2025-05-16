using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using WeatherApp.Interfaces;

namespace weather_app;

public class WeatherObserver : IObserver
{
    public void ShowTemp(float temp)
    {
        Console.WriteLine($"{Random.Shared.GetHashCode() }The current temperature is {temp}°C");
    }
}