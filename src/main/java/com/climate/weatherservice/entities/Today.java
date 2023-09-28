package com.climate.weatherservice.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Date;

import java.sql.Blob;
import java.time.LocalDate;
//import java.util.Date;

@Data
@Entity
@Table(name = "weatherdata")
public class Today {
    @Id
    private Date date;
    private String location;
//    @Column( columnDefinition = "json" )
    @Column (columnDefinition = "TEXT")
    private String rawdata;
}
