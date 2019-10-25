package com.example.weatherjustin.Common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {
    public static String API_KEY = "e62a6592698344002b2425ac4eec2de1";
    public static String API_LINK = "http://api.openweathermap.org/data/2.5/weather";

    //function create a functional link to api path
    public static String apiRequest(String lat,String lng)
    {
        StringBuilder sb = new StringBuilder(API_LINK);
        sb.append(String.format("?lat=%s&lon=%s&APPID=%s&units=metric",lat,lng,API_KEY));
        return sb.toString();
    }

    //function for convert the unix time stamp to date type with format "HH:mm"
    public static String unixTimeStampToDateTime(double unixTimeStamp)
    {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        date.setTime((long)unixTimeStamp*1000);
        return dateFormat.format(date);
    }

    //function for get a link image from openweathermap
    public static String getImage(String icon)
    {
        return String.format("http://openweathermap.org/img/w/%s.png",icon);
    }

    //function for get Date with format "dd MMMM yyyy HH:mm"
    public static String getDateNow()
    {
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }


}
