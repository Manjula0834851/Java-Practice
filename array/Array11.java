package array;

import java.util.Arrays;

public class Array11 {

	public static void main(String[] args) {
		int[] age = { 23, 33, 45, 65, 34, 55 };
		// Arrays.sort(age);
		int i, j;
		for (i = 0; i < age.length; i++) {
			for (j = i+1; j < age.length; j++) {

				int temp = 0;
				if (age[j] < age[i]) {

					temp = age[i];
					age[i] = age[j];
					age[j] = temp;
				}

			}

			System.out.println("Sorted no:" + Arrays.toString(age));
		}

	}
}