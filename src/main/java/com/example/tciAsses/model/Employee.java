package com.example.tciAsses.model;

public class Employee {
        private String empName;
        private int amount;

        public Employee() {}

    public Employee(String empName, int amount) {
        this.empName = empName;
        this.amount = amount;
    }

    public String getEmpName() {
            if(empName==null)
                return empName="";
            return empName;
        }

        public void setEmpName(String empName) {
            this.empName = empName;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }
    }


