package flightapp.repositories;

import java.util.List;
import java.util.Map;

public class BaggageRepository {
    private Map<Integer, List<String>> destinationBaggageMap;

    public BaggageRepository(Map<Integer, List<String>> destinationBaggageMap) {
        this.destinationBaggageMap = destinationBaggageMap;
    }

    public boolean isExist(int destinationId, String baggageId) {
        if (destinationBaggageMap.get(destinationId) == null)
            return false;
        List<String> list = destinationBaggageMap.get(destinationId);
        return list.contains(baggageId);
    }
}
