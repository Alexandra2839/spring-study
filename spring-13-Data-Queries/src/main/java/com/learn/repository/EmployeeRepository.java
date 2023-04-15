package com.learn.repository;

import com.learn.entity.Employee;
import net.bytebuddy.asm.Advice;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;
import java.util.List;

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


}
