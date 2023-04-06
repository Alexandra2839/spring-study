package com.learn.repository;

import com.learn.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository no longer needed, it is done implicitly
public interface CarRepository extends JpaRepository <Car, Long> {


}
