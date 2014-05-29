package com.hightail.interfaces;

import com.hightail.yahoo.weather.entities.Rss;

/**
 * Created by mshahid on 5/30/14.
 */
public interface YahooWeather {
    public Rss getResponse(String cityName);
    public Rss getResponse(long cityId);
}
