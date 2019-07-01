package headFirstDesignPatterns.chapter2.impl;

import headFirstDesignPatterns.chapter2.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;

    private Observable weatherData;

    public CurrentConditionDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    public void update(Observable observable, Object arg) {
        if( observable != null && observable instanceof WeatherData){
            this.temperature = ((WeatherData) observable).getTemperature();
            this.humidity = ((WeatherData) observable).getHumidity();
            this.pressure = ((WeatherData) observable).getPressure();
        }
        display();
    }

    public void display() {
        if( weatherData.hasChanged() ){
            System.out.println("temperature : "+this.temperature + "F humidity : "+this.humidity + "%");
        }
    }

}
