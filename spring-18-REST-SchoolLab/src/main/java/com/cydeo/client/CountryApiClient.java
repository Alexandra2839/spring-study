package com.cydeo.client;

import com.cydeo.dto.country.CountryDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url="https://restcountries.com/v3.1", name="COUNTRY-CLIENT")
public interface CountryApiClient {

    @GetMapping("/name/{name}")
    CountryDTO getCountryInfo(@PathVariable ("name") String countryName);
}
