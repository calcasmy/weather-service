package com.climate.weatherservice.dataaccess;

import com.climate.weatherservice.entities.Today;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository("jpa")
public class WeatherJPADataAccessService implements WeatherDAO{


    private final WeatherRepo weatherRepo;

    public WeatherJPADataAccessService(WeatherRepo weatherRepo) {
        this.weatherRepo = weatherRepo;
    }

    @Override
    public Today getTodayWeather() {
        Today today = new Today();
        return today;
    }

    @Override
    public Today getWeatherByDate(Date date) {
        Today today = new Today();
        return today;
    }

    @Override
    public void insertWeather() {}

    @Override
    public boolean existsWeatherByDate(Date date) {
        return true;
    }

    @Override
    public void deleteWeatherByDate(Date date) {}
}
