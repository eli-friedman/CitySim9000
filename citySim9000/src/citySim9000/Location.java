package citySim9000;


public class Location {
		private String name;
		private Location connection1;
		private String con1Name;
		private Location connection2;
		private String con2Name;
		private String street1;
		private String street2;
    	
    	public Location(String nm, Location a, String con1nm, String st1, Location b, String con2nm, String st2) {
    		name = nm;
    		connection1 = a;
    		con1Name = con1nm;
    		connection2 = b;
    		con2Name = con2nm;
    		street1 = st1;
    		street2 = st2;
    	}
    	
    	public String getName() {
    		return this.name;
    	}
    	
    	public Location getCon1() {
    		return this.connection1;
    	}
    	
    	public String getCon1Name() {
    		return this.con1Name;
    	}
    	
    	public String getSt1() {
    		return this.street1;
    	}
    	
    	public Location getCon2() {
    		return this.connection2;
    	}
    	
    	public String getCon2Name() {
    		return this.con2Name;
    	}
    	
    	public String getSt2() {
    		return this.street2;
    	}
    	

    	public void setCons(Location l, Location l2) {
    		this.connection1 = l;
    		this.connection2 = l2;
    	}
}
