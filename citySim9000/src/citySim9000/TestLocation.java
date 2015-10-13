package citySim9000;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLocation {

	//Testing getName method of Location class by Instantiating a location
	//with a name and asserting that getName equals the name.
	@Test 
	public void testGetName() {
		Location loc = new Location("Joe", null, null, null, null, null, null);
		assertEquals("Joe", loc.getName());
	}

	//Testing that when Location loc2 adds loc1 as its first
	//connection the getCon1 returns loc1.
	@Test
	public void testGetCon1() {
		Location loc1 = new Location(null, null, null, null, null, null, null);
		Location loc2 = new Location(null, loc1, null, null, null, null, null);
		assertEquals(loc1, loc2.getCon1());
	}

	//Testing that when a Location is instantiated the first connection
	//name equals the name entered.
	@Test
	public void testGetCon1Name() {
		Location loc = new Location(null, null, "Book Store", null, null, null, null);
		assertEquals("Book Store", loc.getCon1Name());
	}

	//Testing that when a Location is instantiated the first connection
	//name equals the name entered as an argument.
	@Test
	public void testGetSt1() {
		Location loc = new Location(null, null, null, "Fourth Ave.", null, null, null);
		assertEquals("Fourth Ave.", loc.getSt1());
	}
	
	//Testing that when Location loc2 adds loc1 as its first
	//second connection getCon returns loc1.
	@Test
	public void testGetCon2() {
		Location loc1 = new Location(null, null, null, null, null, null, null);
		Location loc2 = new Location(null, null, null, null, loc1, null, null);
		assertEquals(loc1, loc2.getCon2());
	}

	//Testing that when a Location is instantiated the second connection
	//name equals the name entered as an argument.
	@Test
	public void testGetCon2Name() {
		Location loc = new Location(null, null, null, null, null, "Book Store", null);
		assertEquals("Book Store", loc.getCon2Name());
	}

	//Testing that when a Location is instantiated the first connection
	//name equals the name entered as an argument.
	@Test
	public void testGetSt2() {
		Location loc = new Location(null, null, null, null, null, null, "Fourth Ave.");
		assertEquals("Fourth Ave.", loc.getSt2());
	}

	//Testing that when a Location loc3 sets Locations loc1 and loc2 as connections the getCon1 and 
	// and getCon2 methods return loc1 and loc2
	@Test
	public void testSetCons() {
		Location loc1 = new Location(null, null, null, null, null, null, null);
		Location loc2 = new Location(null, null, null, null, null, null, null);
		Location loc3 = new Location(null, null, null, null, null, null, null);
		loc3.setCons(loc1, loc2);
		assertEquals(loc1, loc3.getCon1());
		assertEquals(loc2, loc3.getCon2());
	}

}
