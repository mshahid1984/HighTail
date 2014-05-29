package com.hightail.implelemtation.test;

import com.hightail.util.MySoftAssert;
import com.hightail.yahoo.weather.entities.Rss;
import org.testng.annotations.Test;
import com.hightail.implementation.WeatherData;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by mshahid on 5/30/14.
 */
@Test
public class WeatherDataTest {

    public void positiveAsserts(Rss response){
        MySoftAssert softAssert = new MySoftAssert();
        softAssert.assertNotNull(response, "response should not be null");
        softAssert.assertNotNull(response.getChannel(), "Channel should not be null");
        softAssert.assertNotNull(response.getChannel().getTitle(), "Title should not be null");
        softAssert.assertEquals(response.getChannel().getTitle(), "Yahoo! Weather - Sunnyvale, CA", "Title is not matching");
        softAssert.assertNotNull(response.getChannel().getLocation(), "Location should not be null");
        softAssert.assertEquals(response.getChannel().getLocation().getCity(), "Sunnyvale", "cityName is not matching");
        softAssert.assertAll("com.hightail.implelemtation.test.WeatherDataTest.getResponsePositveTest");
    }
    @Test
    public void getResponsePositveTest(){
        Rss response = new WeatherData().getResponse(2502265);
        positiveAsserts(response);
    }
    @Test
    public void getResponseNegativeTest(){
        Rss response = new WeatherData().getResponse(2502266);
        MySoftAssert softAssert = new MySoftAssert();
        softAssert.assertNotNull(response, "response should not be null");
        softAssert.assertNotNull(response.getChannel(), "Channel should not be null");
        softAssert.assertNotNull(response.getChannel().getTitle(), "Title should not be null");
        softAssert.assertNotNull(response.getChannel().getTitle().contains("Error"), "Title must have error");
        softAssert.assertAll("com.hightail.implelemtation.test.getResponseNegativeTest");
    }
    @Test
    public void getResponseFromYahooPositive(){
        Rss response = null;
        try{
            Method method = WeatherData.class.getDeclaredMethod("getResponseFromYahoo", String.class);
            method.setAccessible(true);
            response = (Rss)method.invoke(new WeatherData(), "2502265");
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }catch (SecurityException s){
            s.printStackTrace();
        }catch (IllegalAccessException a){
            a.printStackTrace();
        }catch (InvocationTargetException i){

        }
        positiveAsserts(response);
    }
}
