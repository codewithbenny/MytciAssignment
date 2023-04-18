package com.example.tciAsses.repository;

import com.example.tciAsses.model.Bonus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BonusRepository extends JpaRepository<Bonus.EmployeeBonus, Long> {

    // This is Repository Layer Where we connect with database

    // By Calling this method on Service Layer we get Eligible Employees

    @Query(value = "SELECT * \n" +
            "FROM bonus \n" +
            "WHERE exit_date > CURDATE() \n" +
            "AND joining_date <= CURDATE();",nativeQuery = true)
    List<Bonus.EmployeeBonus> getEligibleEmployees();

}
