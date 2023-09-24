package com.climate.weatherservice.services;

import com.climate.weatherservice.entities.Today;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Date;

@Service
public class WeatherService {

    @Autowired
    Environment environment;

    private final WebClient webClient;

    @Autowired
    public WeatherService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl
                        ("https://api.weatherapi.com/")
                .build();
    }

    public Date getDate() {
        Date date = new Date();
        return date;
    }

    public Today getWeather() {
//        String todayWeather = makeApiCall();
        Today today = new Today();
        today.setDate(getDate());
        today.setLocation("Kinabalu");
        today.setRawdata(makeApiCall());
        return today;
    }

    public String makeApiCall() {
        return webClient
                .get()
                .uri("/v1/forecast.json?key=%s&q=%s&days=1&aqi=no&alerts=no".formatted(environment.getProperty("api.WEATHERA_API_KEY"), environment.getProperty("api.WEATHER_API_LAT_LONG"))) // Replace with your API endpoint path
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }


}
