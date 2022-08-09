package array;
import java.util.Arrays;
public class ArrayCopy {

	public static void main(String[] args) {
		int[] source = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        
        System.out.println("Source array = " + Arrays.toString(source));
        int[] dest = new int[source.length-1];        
        
        int j=0;
        for(int i=0;i<source.length;i++){
            if(source[i]!=3){
                dest[j]=source[i];
                j++;
            }
        }
        System.out.println("Dest array = " + Arrays.toString(dest));
        
	}

}
