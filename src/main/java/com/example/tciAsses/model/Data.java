package com.example.tciAsses.model;

import java.util.List;

public class Data {
    private List<Employee> employees;
    private String currency;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Data() {}

    public Data(List<Employee> employees, String currency) {
        this.employees = employees;
        this.currency = currency;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}


