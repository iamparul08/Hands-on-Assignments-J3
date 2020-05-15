 class Six {
	 
	 public static void main(String args[]) {
		 
		 int number[] = {33, 24, 55, 12, 50};
		 int n = number.length;
		 System.out.println("given list: ");
		 for(int i=0; i<n; i++) {
			 
			 System.out.println("" + number[i]);
			 
		 }
		 //sorting begins
		 for(int i=0;i<n;i++) {
			 
			 for(int j=i+1; j<n; j++) {
				 
				 if(number[i] > number[j]) {
					 int temp = number[i];
					 number[i] = number[j];
					 number[j] = temp;
				 }
			 }
			 
		 }
		 System.out.println("Sorted list: ");
     		for(int i=0; i<n; i++) {
				System.out.println("" + number[i]);
			}
		 
	 }
	 
 }