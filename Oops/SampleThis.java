package Oops;

public class SampleThis {

	int x1=23;
	double y1=23.34;

	public SampleThis() {
		System.out.println("this is sample()");
	}

	public void test() {
		System.out.println("this = " + this);
	}

	public static void main(String[] args) {
		SampleThis s1 = new SampleThis();
		SampleThis s2 = new SampleThis();
		System.out.println(" s1 = " + s1.x1);
		s1.test();
		System.out.println(" s2 = " + s2.y1);
		s2.test();
		s1.test();
	}
}
