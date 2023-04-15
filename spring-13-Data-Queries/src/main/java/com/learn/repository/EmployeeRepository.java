package com.learn.repository;

import com.learn.entity.Employee;
import net.bytebuddy.asm.Advice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;
import java.util.List;

import static org.hibernate.loader.Loader.*;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByEmail(String email);

    List<Employee> findByFirstNameAndLastNameOrEmail(String firstNAme, String lastName, String email);

    List<Employee> findByFirstNameIsNot(String name);

    List<Employee> findByLastNameStartsWith(String pattern);

    List<Employee> findBySalaryGreaterThan(Integer salary);

    List<Employee> findBySalaryLessThan(Integer salary);

    List<Employee> findByHireDateBetween(LocalDate startDate, LocalDate endDate);

    List<Employee> findBySalaryIsGreaterThanEqualOrderBySalary(Integer salary);

    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);

    List<Employee> findByEmailIsNull();

    @Query ("SELECT e FROM Employee e WHERE e.email = 'amcnee1@google.es'")
    Employee retrieveEmployeeDetails();

    @Query ("SELECt e.salary FROM Employee e WHERE e.email = 'amcnee1@google.es'")
    Integer retrieveEmployeeSalary();


}
