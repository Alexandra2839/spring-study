package com.learn.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@Table(name = "COURSES")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "NAME")
    private String name;

    @Column (name = "CATEGORY")
    private String category;

    @Column(name = "RATING")
    private Integer rating;

    @Column(name = "DESCRIPTION")
    private String description;
}
