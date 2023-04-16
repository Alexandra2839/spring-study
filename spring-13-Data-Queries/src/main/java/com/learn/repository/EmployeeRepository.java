package com.learn.repository;

import com.learn.QueryDemo;
import com.learn.entity.Employee;
import net.bytebuddy.asm.Advice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;
import java.util.List;

import static org.hibernate.loader.Loader.*;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByEmail(String email);//Derived query

    List<Employee> findByFirstNameAndLastNameOrEmail(String firstNAme, String lastName, String email);

    List<Employee> findByFirstNameIsNot(String name);

    List<Employee> findByLastNameStartsWith(String pattern);

    List<Employee> findBySalaryGreaterThan(Integer salary);

    List<Employee> findBySalaryLessThan(Integer salary);

    List<Employee> findByHireDateBetween(LocalDate startDate, LocalDate endDate);

    List<Employee> findBySalaryIsGreaterThanEqualOrderBySalary(Integer salary);

    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);

    List<Employee> findByEmailIsNull();

    @Query ("SELECT e FROM Employee e WHERE e.email = 'amcnee1@google.es'") //JPQL Java Persistence Query Language
    Employee retrieveEmployeeDetails();

    @Query ("SELECt e.salary FROM Employee e WHERE e.email = 'amcnee1@google.es'")
    Integer retrieveEmployeeSalary();


    // JPQL positional parameters
    @Query("SELECT e FROM Employee e WHERE e.salary <> ?1")
    List<Employee> retrieveEmployeeSalaryNotEqual(int salary);

    @Query("SELECT e FROM Employee e WHERE e.firstName LIKE ?1")
    List<Employee> retrieveEmployeeFirstNameLike(String pattern);

    @Query("SELECT e FROM Employee e WHERE e.salary < ?1 ")
    List<Employee> retrieveEmployeeSalaryLessThan(int salary);

    @Query("SELECT e FROM Employee e WHERE e.salary > ?1 ")
    List<Employee> retrieveEmployeeSalaryGreaterThan(int salary);


    @Query("SELECT e FROM Employee e WHERE e.salary BETWEEN ?1 AND ?2")
    List<Employee> retrieveEmployeeSalaryBetween(int salary1, int salary2);

    @Query("SELECT e FROM Employee e WHERE e.hireDate < ?1")
    List<Employee> retrieveEmployeeHireDateBefore(LocalDate date);

    //NULL
    @Query("SELECT e FROM Employee e WHERE e.email IS NULL")
    List<Employee> retrieveEmployeeEmailIsNull();

    @Query("SELECT e FROM Employee e WHERE e.email IS NOT NULL")
    List<Employee> retrieveEmployeeEmailIsNotNull();

    @Query("select e FROM Employee e ORDER BY e.salary")
    List<Employee> retrieveEmployeeSalaryOrderAsc();

    @Query("select e FROM Employee e ORDER BY e.salary DESC")
    List<Employee> retrieveEmployeeSalaryOrderDesc();

    //Native query

    @Query (value = "select * from employees where salary = ?1", nativeQuery = true)
    List<Employee> retrieveEmployeeDetailBySalary(int salary);

    //named parameter
    @Query("select e from Employee e where e.salary = :salary")
    List<Employee> retrieveEmployeeBySalary(@Param("salary")int salary);



}
