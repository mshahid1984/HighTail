package com.hightail.yahoo.weather.entities.custom;

/**
 * Created by mshahid on 5/30/14.
 */
public class Temperature {
    int value;
    TemperatureUnit unit = TemperatureUnit.Degree;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setUnit(TemperatureUnit unit) {
        this.unit = unit;
    }

    public TemperatureUnit getUnit() {
        return unit;
    }
}

