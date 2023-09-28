package com.climate.weatherservice.entities;

import java.util.List;
import lombok.Data;

@Data
public class Forecastday {
    private String date;
    private Long date_epoch;
    private Day day;
    private Astro astro;
    private List<Hour> hour;
}