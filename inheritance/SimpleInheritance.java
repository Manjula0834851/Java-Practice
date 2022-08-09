package inheritance;

class Parent {
	int x1 = 50;

	public void display() {
		System.out.println("this is display() of parent class");
	}
}

class Child extends Parent {
	int y1 = 100;

	public void test() {
		System.out.println("this is test() method of child class");
	}
}

class Child1 extends Child {
	
	int z1 = 110;

	public void testcase() {
		System.out.println("this is test() method of child class 1");
	}
}
class SimpleInheritance {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.display();
		//p1.test();
		
		Child c1 = new Child();
		c1.display();
		System.out.println("Value of x1 = " + c1.x1);
		c1.test();
		System.out.println("Value of y1 = " + c1.y1);
	
		
		Child1 n1 = new Child1();
		n1.testcase();
		System.out.println("Value of y1 = " + n1.z1);
		
	}
}
