package org.crayeres.observer;

import java.util.Observable;

/**
 * Created by Administrator on 2017/12/13 0013.
 */
public class WeatherData extends Observable {

    private float temperature;

    private float humidity;

    private float pressure;

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurement(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
