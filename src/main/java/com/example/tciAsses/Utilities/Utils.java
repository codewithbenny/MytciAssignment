package com.example.tciAsses.Utilities;

import com.example.tciAsses.model.Bonus;

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
    public static void sortByName(List<Bonus.EmployeeBonus> employees) {
        Collections.sort(employees, new Comparator<Bonus.EmployeeBonus>() {
            public int compare(Bonus.EmployeeBonus emp1, Bonus.EmployeeBonus emp2) {
                if(emp1.getEmpName()==null){
                    emp1.setEmpName("");
                }if(emp2.getEmpName()==null){
                    emp2.setEmpName("");
                }
                return emp1.getEmpName().compareTo(emp2.getEmpName());
            }
        });
    }

}
