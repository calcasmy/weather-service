package com.climate.weatherservice.dataaccess;

import com.climate.weatherservice.entities.Today;

import java.util.Date;

public interface WeatherDAO {

    Today getTodayWeather();
    Today getWeatherByDate(Date date);
    void insertWeather();
    boolean existsWeatherByDate(Date date);
    void deleteWeatherByDate(Date date);

}
