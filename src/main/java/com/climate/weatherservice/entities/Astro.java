package com.climate.weatherservice.entities;

import lombok.Data;

@Data
public class Astro {
    private String sunrise;
    private String sunset;
    private String moonrise;
    private String moonset;
    private String moon_phase;
    private String moon_illumination;
    private Long is_moon_up;
    private Long is_sun_up;
}
