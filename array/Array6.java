package array;

import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		int age[]= new int [4];
		age[0]=55;
		age[1]=65;
		age[2]=50;
		age[3]=53;
		
		for (int i=0;i<4;i++)
		{
		System.out.println(age[i]);
		}
		
		age[2]=35;
			System.out.println(Arrays.toString(age));

	}

}
