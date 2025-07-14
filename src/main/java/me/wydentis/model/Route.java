package me.wydentis.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

import java.util.List;

@Entity
@Table(name = "routes")
@Getter
public class Route {

    @Id
    private String routeId;
    @ElementCollection
    private List<StationTiming> stationTimings;
    private String comfortClass;
    private String executingTime;

}
