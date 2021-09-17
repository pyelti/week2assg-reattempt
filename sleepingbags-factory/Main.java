import factory.SleepingBagFactory;
import factory.Sleepingbag;
import factory.SleepingbagStore;
import utils.Constants;

public class Main {

    public static void main(String[] args) {
        SleepingBagFactory factory = new SleepingBagFactory();

        String season = Constants.S_FOUR_WEATHER_RATINGS;
        String size = Constants.DOUBLE_SIZE;
        String tempRatings = Constants.COMFORT_TEMP_RATINGS;

        SleepingbagStore store = new SleepingbagStore(factory);
        Sleepingbag bag = store.orderSleepingBag(season, size, tempRatings);
        System.out.println(bag);
    }
}
