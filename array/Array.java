package array;

public class Array {

	public static void main(String[] args) {
		int[] arr;
		arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at index " + i + " : " + arr[i]);
		
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	    System.out.println(cars[2]);
	    System.out.println(cars.length);
		
		int marks[]=new int[5];
		marks[0]=67;
		marks[1]=20;
		marks[2]=62;
		marks[3]=85;
		marks[4]=55;
		for(int index=0; index<5; index++)
		{
		System.out.println(marks[index]);
		}

	}

}
