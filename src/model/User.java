// PROGRESSION _1
/*Create a class called User inside the model package with the following arguments*
*private String name*
*private String number*
*private int age*
*private int height*
*private int weight*
*private String country*
*Generate appropriate getters and setters.*
*Generate the constructor User (String name, String number, int age, int height, int weight, String country) inside the User class.*
*/


package model;
public class User {
//	Instance Variable
	private String name;
	private String number;
	private int age;
	private int height;
	private int weight;
	private String country;
	
//	Constructor
	public User(String name, String number, int age, int height, int weight, String country) {
		super();
		this.name = name;
		this.number = number;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}