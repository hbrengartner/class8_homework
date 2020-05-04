public class holiday {

//	Minimum 3 private instance variables
//	An empty constructor
//	A constructor that uses only 2 of your three variables
//	A constructor that uses all 3 of your instance variables
//	Get methods for all 3 of your instance variables
//	Set Methods for all 3 of your instance variables
//	A method that returns a Boolean
//	A method that returns a String
	
	private String month;
	private int day;
	private String name;
	private Boolean weekend = true;
	
	public holiday() {	
	}
	
	public holiday(int day, String month) { 
		this.day = day; 
		this.month = month; 	
	}
	
	public holiday(int day, String month, String name) { 
		this.day = day; 
		this.month = month; 
		this.name = name;
	}
//Get Methods
	
	public String getName() {
		return this.name;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public String getMonth() {
		return this.month;
	}
	
//Set Methods
	
	public void setName(String name) {
		this.name= name;
	}
	
	public void setDay(int day) {
		this.day= day;
	}
	
	public void setMoth(String month) {
		this.month= month;
	}
	
// A method that returns a boolean	
	public Boolean weekend() {
		return this.weekend;
	}
	
// A method that returns a string 
	public void christmas() {
		System.out.println("Today is Christmas");
	}
	
}
