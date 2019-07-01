package headFirstDesignPatterns.chapter2;

import headFirstDesignPatterns.chapter2.impl.CurrentConditionDisplay;
import headFirstDesignPatterns.chapter2.impl.WeatherData;

public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMesurements(100,20,40);
        weatherData.setMesurements(120,30,42);
        weatherData.setMesurements(103,42,30);
    }
}
