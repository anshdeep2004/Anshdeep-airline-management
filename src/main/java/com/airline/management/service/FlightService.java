package com.airline.management.service;

import com.airline.management.model.Flight;
import com.airline.management.model.Schedule;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FlightService {
    private final List<Flight> flights_25 = new ArrayList<>();

    // Constructor to initialize some sample data
    public FlightService() {
        // Sample flight
        Flight flight_25 = new Flight(1L, "AA101", "NYC", "LAX");
        Schedule schedule_25 = new Schedule(1L, LocalDateTime.of(2025, 3, 22, 10, 0), LocalDateTime.of(2025, 3, 22, 14, 0), 1L);
        flight_25.getSchedules_25().add(schedule_25);
        flights_25.add(flight_25);
    }

    public List<Flight> getAllFlights(String sort_25) {
        List<Flight> result_25 = new ArrayList<>(flights_25);
        if ("asc".equalsIgnoreCase(sort_25)) {
            result_25.sort((f1_25, f2_25) -> f1_25.getFlightNumber_25().compareTo(f2_25.getFlightNumber_25()));
        }
        return result_25;
    }

    public Optional<Flight> getFlightById(Long id_25) {
        return flights_25.stream().filter(f_25 -> f_25.getId_25().equals(id_25)).findFirst();
    }

    public List<Schedule> getFlightSchedules(Long flightId_25) {
        return flights_25.stream()
                .filter(f_25 -> f_25.getId_25().equals(flightId_25))
                .findFirst()
                .map(Flight::getSchedules_25)
                .orElse(new ArrayList<>());
    }
}