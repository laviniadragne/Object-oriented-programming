package storage;
import communication.ServerMessage;
import main.Utils;

import java.util.Observable;
import java.util.Observer;

public class ServerCommunicationController implements Observer {

    @Override
    public void update(Observable o, Object dataRecord) {
        SensorData sensor = (SensorData) dataRecord;
        System.out.println("ServerCommunicationController: "  +
                new ServerMessage(sensor.getStepsCount(), Utils.getClientId(),
                sensor.getTimestamp()));

    }
}
