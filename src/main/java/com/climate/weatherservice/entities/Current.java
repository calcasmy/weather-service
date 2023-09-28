package com.climate.weatherservice.entities;

import lombok.Data;

@Data
public class Current {
    private Long last_updated_epoch;
    private String last_updated;
    private Double temp_c;
    private Double temp_f;
    private Long is_day;
    private Condition condition;
    private Double wind_mph;
    private Double wind_kph;
    private Long wind_degree;
    private String wind_dir;
    private Double pressure_mb;
    private Double pressure_in;
    private Double precip_mm;
    private Double precip_in;
    private Long humidity;
    private Long cloud;
    private Double feelslike_c;
    private Double feelslike_f;
    private Double vis_km;
    private Double vis_miles;
    private Double uv;
    private Double gust_kph;
    private Double gust_mph;
}
