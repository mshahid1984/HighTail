package com.hightail.mapper;

import com.hightail.yahoo.weather.entities.Rss;
import com.hightail.yahoo.weather.entities.custom.DayForeCast;
import com.hightail.yahoo.weather.entities.custom.WeatherType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mshahid on 5/30/14.
 */
public class MapYahooWeather {

    public WeatherType mapYahooWeather(Rss yahooWeather){
        WeatherType weather = new WeatherType();

       List<DayForeCast> foreCasts = new ArrayList<DayForeCast>();
        //for(yahooWeather.getChannel().getItem().getForecast())
        // getForecast()
        return weather;
    }
}
