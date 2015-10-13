package citySim9000;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.mockito.Mockito;

public class TestCity {
	
	//Testing the start method by creating an ArrayList of mocked location objects and 
	//stubbing the getName method of the locations to return the names of the first third and
	//last locations in the Locations ArrayList. Then call the start method three times with
	//arguments 0, 2, and 4  and make sure they match the getName of the mocked locations
	@Test
	public void testStart() {
		
		City myCity = new City();
		
		Location mockLoc1 = Mockito.mock(Location.class);
		Mockito.when(mockLoc1.getName()).thenReturn("Mall");
		Location mockLoc2 = Mockito.mock(Location.class);
		Mockito.when(mockLoc2.getName()).thenReturn("University");
		Location mockLoc3 = Mockito.mock(Location.class);
		Mockito.when(mockLoc3.getName()).thenReturn("Outside City");
		ArrayList<Location> list = new ArrayList<Location>();
		list.add(mockLoc1);
		list.add(mockLoc2);
		list.add(mockLoc3);
		
		assertEquals(mockLoc1.getName(), myCity.start(0).getName());
		assertEquals(mockLoc2.getName(), myCity.start(2).getName());
		assertEquals(mockLoc3.getName(), myCity.start(4).getName());
	}

	//Testing the getDriveString method by mocking a location instance and stubbing the 
	//getName, getCon1, getCon2, getSt1, and getSt2 methods to be able to test with 
	//seed arguments 0 and 1 and make sure they return the correct string.
	@Test
	public void testGetDriveString() {
		
		City myCity = new City();
		
		int d = 3;
		
		Location mockLoc = Mockito.mock(Location.class);
		Mockito.when(mockLoc.getName()).thenReturn("University");
		Mockito.when(mockLoc.getCon1Name()).thenReturn("Con1");
		Mockito.when(mockLoc.getCon2Name()).thenReturn("Con2");
		Mockito.when(mockLoc.getSt1()).thenReturn("St1");
		Mockito.when(mockLoc.getSt2()).thenReturn("St2");
		
		int seed = 0;
		assertEquals("Driver 3 heading from University to Con1 via St1", myCity.getDriveString(d, mockLoc, seed));
		
		seed = 1;
		assertEquals("Driver 3 heading from University to Con2 via St2", myCity.getDriveString(d, mockLoc, seed));
	}

	//Testing the drive method by mocking the location class three times, stubbing the getCon1 and 
	//getCon2 methods of the first location to return the second and third locations.
	//Calling drive() with the first location and 0 as arguments should return the second location
	//and with the first location and 1 as arguments drive should return the third location.
	@Test
	public void testDrive() {
		
		City myCity = new City();
		
		Location mockLoc1 = Mockito.mock(Location.class);
		Location mockLoc2 = Mockito.mock(Location.class);
		Location mockLoc3 = Mockito.mock(Location.class);
		
		Mockito.when(mockLoc1.getCon1()).thenReturn(mockLoc2);
		Mockito.when(mockLoc1.getCon2()).thenReturn(mockLoc3);
		
		assertEquals(mockLoc2, myCity.drive(mockLoc1, 0));
		assertEquals(mockLoc3, myCity.drive(mockLoc1, 1));
		
	}

}
