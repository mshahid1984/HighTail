package com.hightail.implementation;

import com.hightail.interfaces.YahooWeather;
import com.hightail.validation.Validation;
import com.hightail.yahoo.weather.entities.Rss;

/**
 * Created by mshahid on 5/30/14.
 */
public class WeatherData implements YahooWeather {

    @Override
    public Rss getResponse(String cityName) {

        Validation validate = new Validation();
        validate.validateCityName(cityName);
        
        return null;
    }

    @Override
    public Rss getResponse(long cityId) {
        return null;
    }
}
