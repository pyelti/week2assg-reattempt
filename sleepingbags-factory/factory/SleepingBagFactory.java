package factory;

import utils.Constants;

public class SleepingBagFactory {

    public Sleepingbag getSleepingBag(String season) {
        switch (season) {
            case Constants.S_ONE_WEATHER_RATINGS:
                return new SleepingBagOne();
            case Constants.S_TWO_WEATHER_RATINGS:
                return new SleepingBagTwo();
            case Constants.S_THREE_WEATHER_RATINGS:
                return new SleepingBagThree();
            case Constants.S_FOUR_WEATHER_RATINGS:
                return new SleepingBagFour();
            default:
                return null;
        }
    }
}
