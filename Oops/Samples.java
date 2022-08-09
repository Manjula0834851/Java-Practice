package Oops;

public class Samples {

	String name;
	int id;
	double sal;

	public Samples() {
	}

	public void display() {
		System.out.println(" name is = " + name);

		System.out.println(" id is = " + id);

		System.out.println(" salary is = " + sal);

	}

	public static void main(String[] args) {
		Samples s = new Samples();
		s.display();
	}

}
