package com.hightail.implementation;

import com.hightail.interfaces.YahooWeather;
import com.hightail.util.Sender;
import com.hightail.util.Serializer;
import com.hightail.validation.Validation;
import com.hightail.yahoo.weather.entities.Rss;

import javax.xml.bind.JAXBElement;

/**
 * Created by mshahid on 5/30/14.
 */
public class WeatherData implements YahooWeather {

    @Override
    public Rss getResponse(String cityName) {

        Validation validate = new Validation();
        validate.validateCityName(cityName);
        return getResponseFromYahoo(cityName);
    }

    @Override
    public Rss getResponse(long cityId) {
        Validation validate = new Validation();
        validate.validateCityCode(cityId);
        return getResponseFromYahoo(Long.toString(cityId));

    }

    private Rss getResponseFromYahoo(String code){
        Sender sender = new Sender();
        String response =  sender.requestSender(code);
        return (Rss)Serializer.stringToJAXBElement(response,Rss.class);
    }
}
