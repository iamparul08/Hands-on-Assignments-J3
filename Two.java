/* Write a program to initialize an integer array and find the maximum and minimum value of the array.*/

 class Two {
	 
		// Method for getting the maximum value
		public static int getMax(int[] inputArray){ 
		
		int maxValue = inputArray[0]; 
		
		for(int i=1;i < inputArray.length;i++){ 
		
			if(inputArray[i] > maxValue){ 
			maxValue = inputArray[i]; 
      }
	  
    } 
    return maxValue; 
  }
	
		//Method for getting the minimum value
		public static int getMin(int[] inputArray) {
			
			int minValue = inputArray[0];
			
			for(int i=1; i<inputArray.length; i++) {
				
				if(inputArray[i] < minValue) {
					minValue = inputArray[i];
				}
				
			}
			return minValue;
			
		}
	 
	 public static void main(String args[]) {
		 
		 int array[] = {44, 36, 4, 80, 100};
		 
		 int max = getMax(array);
		 System.out.println("Maximum value is: " + max);
		 
		 int min = getMin(array);
		 System.out.println("Minium value is: " + min);
		 
	 }
	 
	 
 }