package com.hightail.util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by mshahid on 5/30/14.
 */
public class Sender {
    public String requestSender(long request){
        return requestSender(Long.toString(request));
    }

    public String requestSender(String request){
        String httpUrl = "http://weather.yahooapis.com/forecastrss?w="+request;

        StringBuffer response = null;
        try {
            URL url = new URL(httpUrl);

            //System.out.println("request String: " + request);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/xml");
            connection.setDoOutput(true);



		System.out.println("response code = "+connection.getResponseCode());

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            response = new StringBuffer();
            String tmp;
            while ((tmp = reader.readLine()) != null) {
                response.append(tmp);
            }
            reader.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response.toString();
    }
}
