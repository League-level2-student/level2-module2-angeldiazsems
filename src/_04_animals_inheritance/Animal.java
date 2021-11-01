package _04_animals_inheritance;

public class Animal {
	String name;
	String furColor;
	boolean isGirl;
	
	Animal(String name,String furColor, boolean isGirl){
		this.name=name;
		this.furColor=furColor;
		this.isGirl=isGirl;
	}
	
	
	void printName() {
		System.out.println("My name is "+name);
	}
	void play() {
		System.out.println("Playing");
	}
	void eat(){
		System.out.println("Eating");
	}
	void sleep() {
		System.out.println("Sleeping");
	}
}
