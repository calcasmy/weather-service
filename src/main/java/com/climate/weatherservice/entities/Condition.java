package com.climate.weatherservice.entities;

import lombok.Data;

@Data
public class Condition {
    private String text;
    private String icon;
    private Long code;
}
