package com.example.tciAsses.model;

import java.util.List;

public class Bonus {

    private List<EmployeeBonus> bonus;

    public Bonus() {
    }

    public List<EmployeeBonus> getBonus() {
        return bonus;
    }

    public Bonus(List<EmployeeBonus> bonus) {
        this.bonus = bonus;
    }

    public void setBonus(List<EmployeeBonus> bonus) {
        this.bonus = bonus;
    }

    public static class EmployeeBonus {
        private String empName;
        private int amount;
        private String currency;
        private String joiningDate;
        private String exitDate;

        public String getEmpName() {
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

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getJoiningDate() {
            return joiningDate;
        }

        public void setJoiningDate(String joiningDate) {
            this.joiningDate = joiningDate;
        }

        public String getExitDate() {
            return exitDate;
        }

        public void setExitDate(String exitDate) {
            this.exitDate = exitDate;
        }
    }
}
