package dataprocessing;

import main.Utils;
import storage.DataRepository;

public class StepCountStrategyFactory {
    public static StepCountStrategy createStrategy(String strategyType, DataRepository dataRepository) {
        switch (strategyType) {
            case Utils.BASIC_STRATEGY: return new BasicStepCountStrategy(dataRepository.getData());
            case Utils.FILTERED_STRATEGY: return new FilteredStepCountStrategy(dataRepository.getData());
        }
        throw new IllegalArgumentException("Strategia " + strategyType + " nu exista!");
    }
}
