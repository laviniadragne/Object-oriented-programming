package storage;

import java.util.Observable;
import java.util.Observer;

public class ConsoleLogger implements Observer {

    @Override
    public void update(Observable o, Object dataRecord) {
        SensorData latestData = (SensorData) dataRecord;
        System.out.println("ConsoleLogger: " + latestData);
    }

}
