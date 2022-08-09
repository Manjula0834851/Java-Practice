package String;

import java.util.Scanner;

public class StringText {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter some text");
		String sentence = obj.nextLine();
		System.out.println(sentence);
		
		System.out.println("Enter any whole num");
		int age =obj.nextInt();
		System.out.println(age);
	
		System.out.println("Enter any num");
		float marks =obj.nextFloat();
		System.out.println(marks);
		
		System.out.println("Enter length of pipe");
		double length =obj.nextFloat();
		System.out.println(length);
		
		System.out.println("Enter ay");
		float se =obj.nextInt();
		System.out.println(se);

		System.out.println("Enter length of pipe");
		double length1 =obj.nextFloat();
		int length2= (int)length1;
		System.out.println(length2);

	}

}
