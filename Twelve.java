
import java.util.Arrays; 

 public class Twelve {
	 
 public static void main(String[] args)
 {
    int[] array1 = {1, 2, 3};
	int[] array2 = {4, 5, 6};
	
	System.out.println("Array1: " + Arrays.toString(array1)); 
	System.out.println("Array2: " + Arrays.toString(array2)); 
	
    int[] arr = {array1[1], array2[1]};	
	System.out.println("New Array: "+Arrays.toString(arr)); 	 
 }
}