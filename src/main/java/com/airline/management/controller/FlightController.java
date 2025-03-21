package com.airline.management.controller;

import com.airline.management.model.Flight;
import com.airline.management.model.Schedule;
import com.airline.management.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightService flightService_25;

    @GetMapping
    public List<Flight> getAllFlights(@RequestParam(required = false) String sort_25) {
        return flightService_25.getAllFlights(sort_25);
    }

    @GetMapping("/{id_25}")
    public ResponseEntity<Flight> getFlightById(@PathVariable("id_25") Long id_25) {
        return flightService_25.getFlightById(id_25)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{id_25}/schedules")
    public List<Schedule> getFlightSchedules(@PathVariable("id_25") Long id_25,
                                             @RequestParam(required = false) String dates_25) {
        // Ignoring 'dates' filter for simplicity
        return flightService_25.getFlightSchedules(id_25);
    }
}