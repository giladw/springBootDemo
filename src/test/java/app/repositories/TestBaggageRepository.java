package app.repositories;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestBaggageRepository{

    @Test
    public void ticketRepository_whenBaggageNotExist_returnFalse() {
        //Arrange
        HashMap<Integer, List<String>> map = getIntegerListHashMap("baggage_id", 1);
        BaggageRepository a = new BaggageRepository(map);
        //Act
        boolean result = a.isExist(1,"notBag");
        //Assert
        Assert.assertEquals(false, result);
    }

    private HashMap<Integer, List<String>> getIntegerListHashMap(String baggage_id, int destinationId) {
        ArrayList<String> list = new ArrayList<String>();
        list.add(baggage_id);

        HashMap<Integer, List<String>> map = new HashMap<Integer,List<String>>();
        map.put(destinationId, list);
        return map;
    }

}
