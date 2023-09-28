package com.climate.weatherservice.services;

// Application Packages
import com.climate.weatherservice.dataaccess.WeatherDAO;
import com.climate.weatherservice.entities.Today;
import com.climate.weatherservice.entities.Weather;
import com.climate.weatherservice.utilities.JSONUtil;
import com.climate.weatherservice.utilities.WeatherUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.sql.Date;

@Service
public class WeatherService {

    // Thanks to https://www.codejava.net/frameworks/spring-boot/read-values-from-application-properties-file
    @Autowired
    WeatherUtil weatherInfo;

    private final WebClient webClient;
    private final WeatherDAO weatherDAO;

    @Autowired
    public WeatherService(WebClient.Builder webClientBuilder, @Qualifier("jpa") WeatherDAO weatherDAO) {
        this.webClient = webClientBuilder.baseUrl
                        ("https://api.weatherapi.com/")
                .build();
        this.weatherDAO = weatherDAO;
    }

    public Date getDate() {
        long millis = System.currentTimeMillis();
        Date date = new java.sql.Date(millis);
        System.out.println(date);
        return date;
    }

    public Today getWeather() {

//        weatherDAO.getWeatherByDate(getDate());

        String rawData = makeApiCall();
        Today today = new Today();
//        today = weatherDAO.getWeatherByDate(getDate());

        Weather weather =  JSONUtil.convertJsonToJavaObj(rawData, Weather.class);

        today.setDate(getDate());
        today.setLocation(weather.getLocation().getName());
        today.setRawdata(rawData);

        weatherDAO.insertWeather(today);
        return today;
    }

    public String makeApiCall() {
        return webClient
                .get()
//                .uri("/v1/forecast.json?key=%s&q=%s&days=1&aqi=no&alerts=no".formatted(environment.getProperty("api.WEATHERA_API_KEY"), environment.getProperty("api.WEATHER_API_LAT_LONG"))) // Replace with your API endpoint path
                .uri("/v1/forecast.json?key=%s&q=%s&days=1&aqi=no&alerts=no".formatted(weatherInfo.getWEATHERA_API_KEY(), weatherInfo.getWEATHER_API_LAT_LONG())) // Replace with your API endpoint path
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

}
