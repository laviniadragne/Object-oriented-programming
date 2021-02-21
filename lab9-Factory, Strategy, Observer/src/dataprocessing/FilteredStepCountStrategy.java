package dataprocessing;

import main.Utils;
import storage.SensorData;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FilteredStepCountStrategy implements StepCountStrategy{

    private final List<SensorData> listSensor;
    private static final int MAX_DIFF_STEPS_CONSECUTIVE_RECORDS = 1000;
    private static final long TIME_FOR_MAX_DIFF = TimeUnit.SECONDS.toMillis(1);

    public FilteredStepCountStrategy(List<SensorData> sensors) {
        this.listSensor = sensors;
    }
    @Override
    public int getTotalSteps() {
        int sumSteps = 0;

        for (int i = 0 ; i < listSensor.size() - 1; i++) {
            if (listSensor.get(i + 1).getStepsCount() > 0) {
                int dif = listSensor.get(i + 1).getStepsCount() -
                        listSensor.get(i).getStepsCount();
                long difHour = listSensor.get(i + 1).getTimestamp() -
                        listSensor.get(i).getTimestamp();
                if (!(dif > MAX_DIFF_STEPS_CONSECUTIVE_RECORDS
                        && difHour < TIME_FOR_MAX_DIFF )) {
                    sumSteps += listSensor.get(i + 1).getStepsCount();
                }
            }
        }
        if (listSensor.get(0).getStepsCount() > 0) {
            sumSteps += listSensor.get(0).getStepsCount();
        }
            return sumSteps;
    }

    @Override
    public String getStrategyDescription() {
        return Utils.FILTERED_STRATEGY;
    }
}
