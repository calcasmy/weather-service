package com.climate.weatherservice.dataaccess;

import com.climate.weatherservice.entities.Today;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;

@RepositoryRestResource
public interface WeatherRepo extends JpaRepository<Today, Date> {}
