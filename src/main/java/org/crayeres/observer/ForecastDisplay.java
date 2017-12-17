package org.crayeres.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2017/12/13 0013.
 */
public class ForecastDisplay implements Observer {

    Observable observable;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    private float currentPressure = 29.92f;

    private float lastPressure;

    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            this.display();
        }
    }

    public void display() {
        System.out.println("forecast: currentPressure " + currentPressure + ", lastPressure " + lastPressure);
    }
}
