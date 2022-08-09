package Oops;

class People {
	String name;
	int age;
	
	void walk()
	{
		System.out.println(name+" is walking ");
	}
	void run()
	{
		System.out.println(name+" is running ");
	}
	void eat()
	{
		System.out.println(name+" is eating ");
	}
	
	
}
public class NewClass {
	public static void main(String[] args) {
		
		People P1 = new People();
		P1.name= "Shwe";
		P1.age=22;
		
		People P2 = new People();
		P2.name= "Tina";
		P2.age=23;
		System.out.println(P1.name+" "+P1.age);
		System.out.println(P2.name+" "+P2.age);
		
		P1.eat();
		P2.walk();
		P1.run();
	}

}


