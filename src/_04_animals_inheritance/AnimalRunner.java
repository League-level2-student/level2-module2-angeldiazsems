package _04_animals_inheritance;

/*
 * 1. Similar to the shapes example, use inheritance to create classes 
 *   in order for this code to work.
 * 
 * HINT: We need a Super class to have all the things that Dog and Cat 
 *       have in common. Lets call that class Animal.
 */
public class AnimalRunner {
	
	public class Animal{
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
	
	
	public static void main(String[] args) {
		Dog d = new Dog("Lucy", "brown", true);
		d.printName();
		d.play();
		d.eat();
		d.sleep();
		
		Cat c = new Cat("Tom", "black", false);
		c.printName();
		c.play();
		c.eat();
		c.sleep();
	}
}
