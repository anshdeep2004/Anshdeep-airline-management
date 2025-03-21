package com.airline.management.model;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private Long id_25;
    private String flightNumber_25;
    private String origin_25;
    private String destination_25;
    private List<Schedule> schedules_25;

    public Flight() {
        this.schedules_25 = new ArrayList<>();
    }

    public Flight(Long id_25, String flightNumber_25, String origin_25, String destination_25) {
        this.id_25 = id_25;
        this.flightNumber_25 = flightNumber_25;
        this.origin_25 = origin_25;
        this.destination_25 = destination_25;
        this.schedules_25 = new ArrayList<>();
    }

    // Getters and Setters
    public Long getId_25() {
        return id_25;
    }

    public void setId_25(Long id_25) {
        this.id_25 = id_25;
    }

    public String getFlightNumber_25() {
        return flightNumber_25;
    }

    public void setFlightNumber_25(String flightNumber_25) {
        this.flightNumber_25 = flightNumber_25;
    }

    public String getOrigin_25() {
        return origin_25;
    }

    public void setOrigin_25(String origin_25) {
        this.origin_25 = origin_25;
    }

    public String getDestination_25() {
        return destination_25;
    }

    public void setDestination_25(String destination_25) {
        this.destination_25 = destination_25;
    }

    public List<Schedule> getSchedules_25() {
        return schedules_25;
    }

    public void setSchedules_25(List<Schedule> schedules_25) {
        this.schedules_25 = schedules_25;
    }
}