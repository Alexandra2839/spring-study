package com.learn.repository;

import com.learn.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region, Integer> {

    //Display all regions in Canada
    List<Region> findByCountry(String country);

    //display all regions with country that includes 'United'
    List<Region> findByCountryContaining(String country);

    List<Region> findByCountryContainsOrderByRegionDesc(String country);

    //display top two regions in US
    List<Region> findTop2ByCountry(String country);

    List<Region> findTopByCountryContainsOrderByRegion(String country);

}
