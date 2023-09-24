package com.climate.weatherservice.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Blob;
import java.util.Date;

@Data
@Entity
@Table(name = "weatherdata")
public class Today {
    @Id
    private Date date;
    private String location;
    @Column( columnDefinition = "json" )
    private String rawdata;
}
