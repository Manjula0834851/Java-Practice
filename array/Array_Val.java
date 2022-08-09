package array;

import java.util.Arrays;

public class Array_Val {

	public static void main(String[] args) {
		Integer marks[] = { 34, 45, 66, 76, 89, 90 };
		marks[3] = 55;
		for (int i = 0; i < marks.length; i++)
			System.out.println(marks[i]);
		
		System.out.println(Arrays.toString(marks));

		System.out.println(marks.length);
		System.out.println(marks[2]);
		System.out.println(marks.length);
		System.out.println(marks[3]);

		
		System.out.print("vvgjh"+ Arrays.toString(marks));

            
        }
	}


