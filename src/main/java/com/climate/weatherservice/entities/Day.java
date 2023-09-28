package com.climate.weatherservice.entities;

import lombok.Data;

@Data
public class Day {
    private Double maxtemp_c;
    private Double maxtemp_f;
    private Double mintemp_c;
    private Double mintemp_f;
    private Double avgtemp_c;
    private Double avgtemp_f;
    private Double maxwind_mph;
    private Double maxwind_kph;
    private Double totalprecip_mm;
    private Double totalprecip_in;
    private Double totalsnow_cm;
    private Double avgvis_km;
    private Double avgvis_miles;
    private Double avghumidity;
    private Long daily_will_it_rain;
    private Long daily_chance_of_rain;
    private Long daily_will_it_snow;
    private Long daily_chance_of_snow;
    private Condition condition;
    private Double uv;

}