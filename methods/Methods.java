package methods;

public class Methods {
	
	 static void add(int a, int b) {
		 
	    System.out.println("I just got executed!");
	    int c = a + b;
	    System.out.println("addition" +c);
	  }
	 static void sub(int a, int b) {
		 System.out.println("HI");
		 int c = a - b;
		 System.out.println("Subtraction of a & b" + " "+c);
	 }


	public static void main(String[] args) {
		add(5,3);
		sub(5,3);
	

	}

}
