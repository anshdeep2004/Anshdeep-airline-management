package com.airline.management.controller;

import com.airline.management.model.Ticket;
import com.airline.management.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService_25;

    @PostMapping
    public Ticket createTicket(@RequestBody Ticket ticket_25) {
        return ticketService_25.createTicket(ticket_25);
    }

    @GetMapping("/{id_25}")
    public ResponseEntity<Ticket> getTicketById(@PathVariable("id_25") Long id_25) {
        return ticketService_25.getTicketById(id_25)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id_25}")
    public ResponseEntity<Void> deleteTicket(@PathVariable("id_25") Long id_25) {
        ticketService_25.deleteTicket(id_25);
        return ResponseEntity.noContent().build();
    }
}