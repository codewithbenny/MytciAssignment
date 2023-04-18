package com.example.tciAsses.controller;


import com.example.tciAsses.model.Bonus;
import com.example.tciAsses.response.MyResponse;
import com.example.tciAsses.service.BonusCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class BonusController {
    @Autowired
    BonusCalculatorService bonusCalculatorService;
    @PostMapping("tci/bonus/eligibility")
    public MyResponse EligibleEmployees(@RequestBody Bonus bonusUI){
        return bonusCalculatorService.calculate(bonusUI.getBonus());
    }

    // Supposing the api giving response
    @GetMapping("/eligibility/server")
    public MyResponse EligibleEmployeesFromServer(){
        return bonusCalculatorService.responseFromApiCall();
    }
}
