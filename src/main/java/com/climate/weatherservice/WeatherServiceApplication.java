package com.climate.weatherservice;

import com.climate.weatherservice.controllers.WeatherController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class WeatherServiceApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(WeatherServiceApplication.class, args);
		WeatherController wController = appContext.getBean(WeatherController.class);
		System.out.println(wController.getWeather());
	}

}
