package citySim9000;

import java.util.ArrayList;

public class City {
	
	private ArrayList<Location> Locations = new ArrayList<Location>();
	private Location mall;
	private Location coffee;
	private Location uni;
	private Location book;
	private Location outside;
	
	public City() {
		mall = new Location("Mall", book, "Bookstore", "Fourth Ave.", coffee, "Coffee Shop", "Meow St.");
		coffee = new Location( "Coffee Shop", outside, "Outside City", "Fifth Ave.", mall, "Mall", "Meow St.");
		uni = new Location("University", coffee,  "Coffee Shop", "Fifth Ave.", book, "Bookstore", "Chirp St.");
		book = new Location("Bookstore", outside, "Outside City", "Fourth Ave.", uni, "University", "Chirp St.");
		outside = new Location("Outside City", mall, "Mall", "Fourth Ave.", uni, "University", "Fifth St.");
		
		mall.setCons(book, coffee);
		coffee.setCons(outside, mall);
		uni.setCons(coffee, book);
		book.setCons(outside, uni);
		outside.setCons(mall, uni);
		
		Locations.add(mall);
		Locations.add(coffee);
		Locations.add(uni);
		Locations.add(book);
		Locations.add(outside);
	}
	
	public Location start(int i) {
		return Locations.get(i);
	}
	
	public String getDriveString(int d, Location l, int i) {
		if(i == 0) {
			String result = "Driver " + d + " heading from " + l.getName() + " to " + l.getCon1Name() + " via " + l.getSt1();
			return result;
		}
		else {
			String result = "Driver " + d + " heading from " + l.getName() + " to " + l.getCon2Name() + " via " + l.getSt2();
			return result;
		}
	}
    
	public Location drive(Location l, int i) {
		Location result;
		if(i == 0) {
			result = l.getCon1();
		}
		else {
			result = l.getCon2();
		}
		return result;
	}
    
}