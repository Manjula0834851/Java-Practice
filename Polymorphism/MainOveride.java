package Polymorphism;
	class Superclass {
		public void disp() {
			System.out.println("this is disp method of superclass");
		}
	}

	class Sublcass extends Superclass {
		public void count() // here method is different
		{
			System.out.println("This is disp() method f subclass");
		}
	}

	class MainOveride {
		public static void main(String[] args) {
			Superclass sup1 = new Superclass();
			sup1.disp();
			Sublcass sub1 = new Sublcass();
			sub1.count();
		
	}
}
