package com.example.tciAsses.service;

import com.example.tciAsses.model.Bonus;
import com.example.tciAsses.response.MyResponse;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface BonusCalculatorService {
     MyResponse calculate(List<Bonus.EmployeeBonus> bonusList) ;
     MyResponse responseFromApiCall();
}
