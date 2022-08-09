package Oops;

class Sample {
	String name;
	int id;
	double sal;

	public Sample(String a, int b, double c) {
		System.out.println("This is sample const...");
		name = a;
		id = b;
		sal = c;
		return;
	}

	public void display() {
		System.out.println(" name is = " + name);
		;
		System.out.println(" id is = " + id);
		;
		System.out.println(" salary is = " + sal);
		;
	}


public static void main(String[] args) {
	Sample s = new Sample("Ajay", 101, 2000);
	s.display();
	Sample s2 = new Sample("Rohit", 102, 2500);
	s2.display();
}
}
