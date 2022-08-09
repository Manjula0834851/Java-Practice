package array;

public class ArrayMax {

	public static void main(String[] args) {
		int arr[]= new int[] { 4, 65, 76, 875};
		
		for (int i = 0; i < arr.length; i = i+2) {  
            System.out.println("Even no's : "+arr[i]);
            }
		int max = arr[0];
		for(int i=0;i < arr.length; i++) {
			if (arr[i]>max)
			max = arr[i];
		}
			System.out.println("Largest No:"+max);
			
		}
	

}
