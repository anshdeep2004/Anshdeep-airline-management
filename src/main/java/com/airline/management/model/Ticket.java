package com.airline.management.model;

public class Ticket {
    private Long id_25;
    private String passengerName_25;
    private String seatNumber_25;
    private Long flightId_25;

    public Ticket() {}

    public Ticket(Long id_25, String passengerName_25, String seatNumber_25, Long flightId_25) {
        this.id_25 = id_25;
        this.passengerName_25 = passengerName_25;
        this.seatNumber_25 = seatNumber_25;
        this.flightId_25 = flightId_25;
    }

    // Getters and Setters
    public Long getId_25() {
        return id_25;
    }

    public void setId_25(Long id_25) {
        this.id_25 = id_25;
    }

    public String getPassengerName_25() {
        return passengerName_25;
    }

    public void setPassengerName_25(String passengerName_25) {
        this.passengerName_25 = passengerName_25;
    }

    public String getSeatNumber_25() {
        return seatNumber_25;
    }

    public void setSeatNumber_25(String seatNumber_25) {
        this.seatNumber_25 = seatNumber_25;
    }

    public Long getFlightId_25() {
        return flightId_25;
    }

    public void setFlightId_25(Long flightId_25) {
        this.flightId_25 = flightId_25;
    }
}