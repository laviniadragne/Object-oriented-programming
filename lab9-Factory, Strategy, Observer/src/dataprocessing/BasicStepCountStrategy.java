package dataprocessing;

import main.Utils;
import storage.SensorData;

import java.util.List;

public class BasicStepCountStrategy implements StepCountStrategy{

    private final List<SensorData> listSensor;

    public BasicStepCountStrategy(List<SensorData> sensors) {
        this.listSensor = sensors;
    }

    @Override
    public int getTotalSteps() {
        int sumSteps = 0;
        for (SensorData sensor: listSensor) {
           sumSteps += sensor.getStepsCount();
        }
        return sumSteps;
    }

    @Override
    public String getStrategyDescription() {
        return Utils.BASIC_STRATEGY;
    }
}
