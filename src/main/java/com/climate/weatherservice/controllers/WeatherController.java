package com.climate.weatherservice.controllers;

import com.climate.weatherservice.entities.Today;
import com.climate.weatherservice.services.WeatherService;
import com.climate.weatherservice.utilities.WeatherUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/")
public class WeatherController {

    @Autowired
    WeatherUtil weatherInfo;

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {this.weatherService = weatherService;}

    @GetMapping
    public Today getWeather() {
        return weatherService.getWeather();
    }



//    @GetMapping


//    public void addWeatherData(Today today) {weatherService.addWeather(today);}
//
//    @GetMapping("{date}")
//    public Today getMovieId(@PathVariable("date") Date date) {
//        return weatherService.getWeather(date);
//    }
//
//    @PostMapping
//    public void addWeather() {
//        weatherService.addWeather(Today);
//    }
//
//    @DeleteMapping("{id}")
//    public void deleteWeather(@PathVariable("date") Date date) {
//        movieService.deleteMovie(date);
//    }

//    @GetMapping("date")
//    public String getTodayWeather(@PathVariable("date") String date) {
//        return weatherService.getWeatherByDate(date);
//    }

}
