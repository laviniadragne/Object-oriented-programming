package storage;


import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Persists sensor data. Observable, its observers are notified when data is added it to.
 */
public class DataRepository extends Observable { // TODO make this an Observable

    private final List<SensorData> data = new ArrayList<>();

    // TODO implement a method to get the stored data (needed by the strategies)
    public List<SensorData> getData() {
        return data;
    }

    public void addData(SensorData dataRecord){
        // TODO
        // store data (e.g. in a List)
        data.add(dataRecord);
        // notifiy observers
        setChanged();
        notifyObservers(dataRecord);
    }

}


