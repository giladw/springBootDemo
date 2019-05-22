package app.repositories;

import java.util.List;

public class TicketRepository {
    private List<Integer> tickets;

    public TicketRepository(List<Integer> tickets) {
        this.tickets = tickets;
    }

    public boolean isTicketExist(int ticketId){
        return tickets.contains(ticketId);
    }
}

