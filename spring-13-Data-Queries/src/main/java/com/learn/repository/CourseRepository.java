package com.learn.repository;

import com.learn.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course, Long> {

    //find all courses by category select* from course where category = ""
    List<Course> findByCategory(String category); // derived query

    //find all courses by category and order entities by name
    List<Course> findByCategoryOrderByName (String category);

    //checks if a course with the supplied name exists/ return true or false

    boolean existsByName(String name);

    //returns count of courses for given category
    int countByCategory(String category);

    List<Course> findByNameStartsWith(String name);

    //find all courses by category and return stream
    Stream<Course> streamAllByCategory(String category);

    @Query("select c from Course c where c.category = :category and c.rating > :rating")
    List<Course> retrieveAllByCategoryAndRatingGreaterThan(@Param("category") String category, @Param("rating") int rating);


}
