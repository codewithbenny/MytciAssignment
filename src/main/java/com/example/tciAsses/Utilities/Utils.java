package com.example.tciAsses.Utilities;

import java.text.SimpleDateFormat;
import java.util.*;

public class Utils {

    public static long  getMillis( String dateString){
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM-dd-yyyy");
        Date date = new Date();
        try {
             date = dateFormat.parse(dateString);
        }catch (Exception e){

        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        long milliseconds = calendar.getTimeInMillis();
        return milliseconds;
    }

    public static boolean isArrayListNullOrEmpty(List<?> list) {
        return (list == null || list.isEmpty());
    }

}
