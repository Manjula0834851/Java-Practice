package Oops;

public class SecondClass {
	public static void main(String[] args) {
		First myCar = new First();
		myCar.fullThrottle();
		myCar.speed(200);
	}
}
class First {
	 void fullThrottle() {
		System.out.println("The car is going as fast as it can!");
	}

	 void speed(int maxSpeed) {
		System.out.println("Max speed is: " + maxSpeed);
	}
}

