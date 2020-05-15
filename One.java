/*Write a program to initialize an integer array and print the sum and average of the array.*/

 class One {
	 
	 public static void main(String args[]) {
	 
	 int sum = 0;
	 float avg;
	 int number[] = {2,5,6,8,10};
	 int n = number.length;
	 
	 for(int i=0; i<n; i++) {
		 
		 System.out.println("" + number[i]);
		 
	 }	 
	 for(int i=0; i<n; i++) {
		 
		 sum  = sum + number[i];		//calculating sum
		 
	 }
	 System.out.println("Sum is: " + sum);
	 
		//calculating average
		avg = sum/n;
		System.out.println("Average is: " + avg);
 
	}
 }