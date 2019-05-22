package flightapp.services;

import flightapp.repositories.TicketRepository;

public class TicketService {
    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    private TicketRepository ticketRepository;

    public boolean isTicketAvailable(int ticketId) {
        return ticketRepository.isTicketExist(ticketId);
    }
}
