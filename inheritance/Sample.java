package inheritance;

class A {
	int a = 20;
}

class B extends A {
	int a = 10;
	void show (int a){
		{
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(super.a);
		}
		}	
}
public class Sample {
	public static void main(String[] args) {
	B obj1=new B();
	obj1.show(50);

	}

}

