package com.climate.weatherservice.utilities;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties (prefix = "api")
@Configuration ("weatherInfo")
public class WeatherUtil {

    private String WEATHER_API_URL;
    private String WEATHERA_API_KEY;
    private String WEATHER_API_LAT_LONG;

    public String getWEATHER_API_URL() {return WEATHER_API_URL;}

    public void setWEATHER_API_URL(String WEATHER_API_URL) {this.WEATHER_API_URL = WEATHER_API_URL;}

    public String getWEATHERA_API_KEY() {return WEATHERA_API_KEY;}

    public void setWEATHERA_API_KEY(String WEATHERA_API_KEY) {this.WEATHERA_API_KEY = WEATHERA_API_KEY;}

    public String getWEATHER_API_LAT_LONG() {return WEATHER_API_LAT_LONG;}

    public void setWEATHER_API_LAT_LONG(String WEATHER_API_LAT_LONG) {this.WEATHER_API_LAT_LONG = WEATHER_API_LAT_LONG;}
}
