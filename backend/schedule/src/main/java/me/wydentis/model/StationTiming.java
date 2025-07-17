package me.wydentis.model;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class StationTiming {

    private String stationName;
    private long arrivalTime;
    private long departureTime;

}