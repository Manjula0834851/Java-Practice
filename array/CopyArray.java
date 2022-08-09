package array;
//import java.util.Arrays;
public class CopyArray {

	public static void main(String[] args) {
	int[] array1 = {1, 2, 3, 4, 5 };  
	int array2[] = new int[array1.length];    
	for (int i=0;i<array1.length;i++) {
		array2[i]=array1[i];
	}
        System.out.println("Elements of original array: "); 
      
        for (int i = 0; i < array1.length; i++) {     
           System.out.print(array1[i] + " ");    
        }     
            
        System.out.println();    
       
        System.out.println("Elements of new array: ");    
        for (int i = 0; i < array2.length; i++) {     
           System.out.print(array2[i] + " ");    
        } 
	}

}
