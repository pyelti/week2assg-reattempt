
public class TestSleepingBag {
	public static void main(String []args) {
		SleepingBagFactory factory=new SleepingBagFactory();
		SleepingBag rectangular=factory.manufacture("Rectangular");
		if(rectangular!=null)
			rectangular.getSleepingBag();
		SleepingBag barrel=factory.manufacture("Barrel");
		if(barrel!=null)
			barrel.getSleepingBag();
		SleepingBag Quilt=factory.manufacture("Quilt");
		if(Quilt!=null)
			Quilt.getSleepingBag();
	}

}
