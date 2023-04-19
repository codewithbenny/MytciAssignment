package com.example.tciAsses.service;

import com.example.tciAsses.Utilities.Utils;
import com.example.tciAsses.model.Bonus;
import com.example.tciAsses.response.MyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class BonusCalculatorServiceImp implements BonusCalculatorService {

    @Autowired
    EmployeeMapperService employeeMapperService;

    @Override
    public MyResponse calculate(List<Bonus.EmployeeBonus> bonusList) {
             if(Utils.isArrayListNullOrEmpty(bonusList)){
                 MyResponse myResponse=new MyResponse();
                 myResponse.setErrorMessage("No Data Found");
                 return myResponse;
             }
            List<Bonus.EmployeeBonus> filteredList = bonusList.stream()
                    .filter(bonus -> Utils.getMillis(bonus.getExitDate()) > System.currentTimeMillis() && Utils.getMillis(bonus.getJoiningDate()) < System.currentTimeMillis())
                    .collect(Collectors.toList());
             Utils.sortByName(filteredList);
        return employeeMapperService.map(filteredList);
    }

    public MyResponse responseFromApiCall(){
        MyResponse response=new MyResponse();
        try {
            // Here leads the implementation
         // List<Bonus.EmployeeBonus> bonusList= bonusRepository.getEligibleEmployees();
            List<Bonus.EmployeeBonus> bonusList= new ArrayList<>();

            if(!Utils.isArrayListNullOrEmpty(bonusList)){
              List<Bonus.EmployeeBonus> filteredList = bonusList.stream()
                      .filter(bonus -> Utils.getMillis(bonus.getExitDate()) > System.currentTimeMillis() && Utils.getMillis(bonus.getJoiningDate()) < System.currentTimeMillis())
                      .collect(Collectors.toList());
              return employeeMapperService.map(filteredList);
          }else{
              response.setErrorMessage("No Data Found");
              return response;
          }
        }catch (Exception e){
            response.setErrorMessage("Something went wrong "+e.getMessage());
            return response;
        }

    }
}
