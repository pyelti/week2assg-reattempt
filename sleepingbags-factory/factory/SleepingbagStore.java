package factory;

public class SleepingbagStore {
    SleepingBagFactory factory;

    public SleepingbagStore(SleepingBagFactory factory) {
        this.factory = factory;
    }

    public Sleepingbag orderSleepingBag(String season, String size, String tempRatings) {

        Sleepingbag bag = factory.getSleepingBag(season);

        bag.setSize(size);
        bag.setTempRatings(tempRatings);

        return bag;

    }

}