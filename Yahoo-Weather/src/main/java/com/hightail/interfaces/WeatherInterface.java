package com.hightail.interfaces;

import com.hightail.yahoo.weather.entities.Rss;
import com.hightail.yahoo.weather.entities.custom.WeatherType;

/**
 * Created by mshahid on 5/30/14.
 */
public interface WeatherInterface {
    public Rss getResponse(String cityName);
    public Rss getResponse(long cityId);
}
