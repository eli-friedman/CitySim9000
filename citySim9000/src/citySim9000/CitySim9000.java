package citySim9000;

import java.util.Random;


public class CitySim9000 {

	public static void main(String[] args) {
		int driver;
		City myCity = new City();
		int comArg = Integer.parseInt(args[0]);
		Random seed = new Random(comArg);
		Location myLoc;

		for(driver = 0; driver < 5; driver++ ) {
			 System.out.println();
			 myLoc = myCity.start(seed.nextInt(5));
			 do {
				 int whereTo = seed.nextInt(2);
			     String toPrint = myCity.getDriveString(driver, myLoc, whereTo);
			     System.out.println(toPrint);
			     myLoc = myCity.drive(myLoc, whereTo);
			 } while (!myLoc.getName().equals("Outside City"));
		}
	}
	
	

}
