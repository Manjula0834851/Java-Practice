package Oops;

public class MainClass2 {

	public static void main(String[] args) {
		
		Person P1 = new Person();
		P1.name= "Shwe";
		P1.age=22;
		System.out.println(P1.name+" "+P1.age);
	}

}

class Person {
	String name;
	int age;
}
