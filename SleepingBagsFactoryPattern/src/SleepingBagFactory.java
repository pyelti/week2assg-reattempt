
public class SleepingBagFactory {
	public SleepingBag manufacture(String name) {
		SleepingBag sleepingBag=null;
		if(name.equalsIgnoreCase("Rectangular")) {
			sleepingBag=new RectangularShaped();
		}else if(name.equalsIgnoreCase("Barrel")) {
			sleepingBag=new BarrelShaped();
		}else {
			System.out.println(name+" Sleeping Bags are not yet manufactured");
		}
		return sleepingBag;
		
	}
	
	
}

