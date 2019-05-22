package app.repositories;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestTicketRepository {

    @Test
    public void ticketRepository_whenTicketNotExist_returnFalse() {
        //Arrange
        ArrayList<Integer> list = getIListOfTickets();
        TicketRepository a = new TicketRepository(list);
        //Act
        boolean result = a.isTicketExist(2);
        //Assert
        Assert.assertEquals(false, result);
    }


    @Test
    public void ticketRepository_whenTicketExists_returnTrue() {
        //Arrange
        ArrayList<Integer> list = getIListOfTickets();
        TicketRepository a = new TicketRepository(list);
        //Act
        boolean result = a.isTicketExist(1);
        //Assert
        Assert.assertEquals(true, result);
    }

    private ArrayList<Integer> getIListOfTickets() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        return list;
    }
}

