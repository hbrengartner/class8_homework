
public class pet {

	private String name; 
	private int age; 
	private String location; 
	private String type;

	
	public pet() {
		System.out.println("This is my pet");
	}
	
	public pet(String name) {
		this.name = name;
		}

	public pet(int age, String type, String name, String location) { 
		this.age = age; 
		this.type = type; 	
		this.name = name;
		this.location = location;
	}
	
	public String getName() {
		return this.name;
}
	public int getAge() {
		return this.age;
}
	public String getType() {
		return this.type;
}
	
	public void setName(String name) {
		this.name= name;
	}
	
	public void setType(String type) {
		this.type= type;
	}
	
	public void setAge(int age) {
		this.age= age;
	}
	
}
