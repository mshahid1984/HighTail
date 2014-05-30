package com.hightail.yahoo.weather.entities.custom;

import java.util.Date;

/**
 * Created by mshahid on 5/30/14.
 */
public class DayForeCast {
    int day;
    Date date;
    Temperature high;
    Temperature low;
    String text;


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Temperature getHigh() {
        return high;
    }

    public void setHigh(Temperature high) {
        this.high = high;
    }

    public Temperature getLow() {
        return low;
    }

    public void setLow(Temperature low) {
        this.low = low;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
