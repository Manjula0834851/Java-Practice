package inheritance;

class Anims {
	Anims() {
		System.out.println("animal is created");
	}
}

class Cat extends Anims {
	Cat() {
		System.out.println("Cat is created");	
	}
}

class TestSuper1 {
	public static void main(String args[]) {
		Cat c = new Cat();
		}
}
