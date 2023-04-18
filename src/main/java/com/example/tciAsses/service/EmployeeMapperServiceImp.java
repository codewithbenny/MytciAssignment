package com.example.tciAsses.service;

import com.example.tciAsses.model.Bonus;
import com.example.tciAsses.model.Data;
import com.example.tciAsses.model.Employee;
import com.example.tciAsses.response.MyResponse;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeMapperServiceImp implements EmployeeMapperService {
    @Override
    public MyResponse map(List<Bonus.EmployeeBonus> bonus) {
        Map<String, Data> responseMap = new HashMap<>();
        Set<Data> dataSet = new HashSet<>();
        for (int i = 0; i < bonus.size(); i++) {
            if (responseMap.containsKey(bonus.get(i).getCurrency())) {
                Data data = responseMap.get(bonus.get(i).getCurrency());
                data.setCurrency(bonus.get(i).getCurrency());
                List<Employee> employeeList = data.getEmployees();
                employeeList.add(new Employee(bonus.get(i).getEmpName(), bonus.get(i).getAmount()));
                data.setEmployees(employeeList);
                dataSet.add(data);
                responseMap.put(bonus.get(i).getCurrency(), data);
            } else {
                Data data = new Data(new ArrayList<>(), bonus.get(i).getCurrency());
                List<Employee> employeeList = new ArrayList<>();
                employeeList.add(new Employee(bonus.get(i).getEmpName(), bonus.get(i).getAmount()));
                data.setEmployees(employeeList);
                dataSet.add(data);
                responseMap.put(bonus.get(i).getCurrency(), data);
            }
        }

        MyResponse myResponse = new MyResponse();
        List<Data> finalDataList=new ArrayList<>(dataSet);
        myResponse.setData(new ArrayList<>(dataSet));

        return myResponse;

    }
}
