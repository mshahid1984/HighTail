package com.hightail.yahoo.weather.entities.custom;

import java.util.List;

/**
 * Created by mshahid on 5/30/14.
 */
public class WeatherType {

    List<DayForeCast> dayForeCastList;


    public List<DayForeCast> getDayForeCastList() {
        return dayForeCastList;
    }

    public void setDayForeCastList(List<DayForeCast> dayForeCastList) {
        this.dayForeCastList = dayForeCastList;
    }
}
