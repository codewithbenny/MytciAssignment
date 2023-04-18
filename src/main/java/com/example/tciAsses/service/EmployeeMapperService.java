package com.example.tciAsses.service;

import com.example.tciAsses.model.Bonus;
import com.example.tciAsses.response.MyResponse;

import java.util.List;

public interface EmployeeMapperService {
    public MyResponse map (List<Bonus.EmployeeBonus> bonus);
}
