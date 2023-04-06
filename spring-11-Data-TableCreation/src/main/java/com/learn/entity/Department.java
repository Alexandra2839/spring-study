package com.learn.entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "departments")
@NoArgsConstructor
@AllArgsConstructor
public class Department extends BaseEntity{


    private String departmentName;
    private String division;

}
