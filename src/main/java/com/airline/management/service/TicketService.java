package com.airline.management.service;

import com.airline.management.model.Ticket;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TicketService {
    private final List<Ticket> tickets_25 = new ArrayList<>();
    private Long ticketIdCounter_25 = 1L;

    public Ticket createTicket(Ticket ticket_25) {
        // Validation: Check if flight exists
        if (!flightExists(ticket_25.getFlightId_25())) {
            throw new RuntimeException("Flight not found");
        }

        // Validation: Check for duplicate seat
        boolean seatTaken_25 = tickets_25.stream()
                .anyMatch(t_25 -> t_25.getFlightId_25().equals(ticket_25.getFlightId_25()) && t_25.getSeatNumber_25().equals(ticket_25.getSeatNumber_25()));
        if (seatTaken_25) {
            throw new RuntimeException("Seat " + ticket_25.getSeatNumber_25() + " is already booked for this flight");
        }

        // Assign ID and save ticket
        ticket_25.setId_25(ticketIdCounter_25++);
        tickets_25.add(ticket_25);
        return ticket_25;
    }

    public Optional<Ticket> getTicketById(Long id_25) {
        return tickets_25.stream().filter(t_25 -> t_25.getId_25().equals(id_25)).findFirst();
    }

    public void deleteTicket(Long id_25) {
        Ticket ticket_25 = tickets_25.stream()
                .filter(t_25 -> t_25.getId_25().equals(id_25))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Ticket not found"));
        tickets_25.remove(ticket_25);
    }

    private boolean flightExists(Long flightId_25) {
        // In a real app, you'd check with FlightService; here we assume flight IDs 1+ exist
        return flightId_25 != null && flightId_25 > 0;
    }
}