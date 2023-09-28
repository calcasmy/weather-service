
package com.climate.weatherservice.entities;

import lombok.Data;

@Data
public class Weather {
    private Current current;
    private Forecast forecast;
    private Location location;
}