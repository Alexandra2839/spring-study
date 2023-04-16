package com.learn.repository;

import com.learn.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.net.DatagramPacket;
import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, String> {

    //display all departments in the furniture
    List<Department>  findByDepartment (String department);

    List<Department>  findByDivision(String division);

    List<Department>  findByDivisionIs (String division);
    List<Department> findByDivisionEquals(String division);


    List <Department> findByDivisionEndsWith(String end);

    List <Department> findDistinctTop3ByDivisionContaining(String contains);

    @Query("select d from Department d where d.division IN ?1")
    List<Department> retrieveDepartmentDivision(List<String> division);



}
