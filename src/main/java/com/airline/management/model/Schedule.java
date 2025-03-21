package com.airline.management.model;

import java.time.LocalDateTime;

public class Schedule {
    private Long id_25;
    private LocalDateTime departureTime_25;
    private LocalDateTime arrivalTime_25;
    private Long flightId_25;

    public Schedule() {}

    public Schedule(Long id_25, LocalDateTime departureTime_25, LocalDateTime arrivalTime_25, Long flightId_25) {
        this.id_25 = id_25;
        this.departureTime_25 = departureTime_25;
        this.arrivalTime_25 = arrivalTime_25;
        this.flightId_25 = flightId_25;
    }

    // Getters and Setters
    public Long getId_25() {
        return id_25;
    }

    public void setId_25(Long id_25) {
        this.id_25 = id_25;
    }

    public LocalDateTime getDepartureTime_25() {
        return departureTime_25;
    }

    public void setDepartureTime_25(LocalDateTime departureTime_25) {
        this.departureTime_25 = departureTime_25;
    }

    public LocalDateTime getArrivalTime_25() {
        return arrivalTime_25;
    }

    public void setArrivalTime_25(LocalDateTime arrivalTime_25) {
        this.arrivalTime_25 = arrivalTime_25;
    }

    public Long getFlightId_25() {
        return flightId_25;
    }

    public void setFlightId_25(Long flightId_25) {
        this.flightId_25 = flightId_25;
    }
}