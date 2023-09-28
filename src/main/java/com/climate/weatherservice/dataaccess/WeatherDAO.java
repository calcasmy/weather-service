package com.climate.weatherservice.dataaccess;

import com.climate.weatherservice.entities.Today;

import java.sql.Date;
import java.util.Optional;

public interface WeatherDAO {

//    Today getTodayWeather();
//    Optional<Today> getWeatherByDate(Date date);
    void insertWeather(Today today);
    boolean existsWeatherByDate(Date date);
    void deleteWeatherByDate(Date date);

}
