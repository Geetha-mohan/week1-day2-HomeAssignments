package week1.day2.HomeAssignments;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {1, 4,3,2,8, 6, 7}; 
		Arrays.sort(array1);
		
		//method1 using for loop
		int arrayIndex = 0;
		for (int i=1;i<=array1[array1.length-1];i++)
		{
			if(i==array1[arrayIndex])
					arrayIndex++;
			else
				System.out.println("missing number in the array is " +i);
		}
		
		
	//method2 using formula “(max*(max+1)/2) – sum” 
		
	int sum = 0;
	for (int i=0;i<=array1.length-1;i++)
	{
		sum+=array1[i];
	}
	System.out.println("sum of elements in the array is "+sum);
	int max = array1[array1.length-1];
	System.out.println("Max element in array is "+max);
	int missingNum =0;
	missingNum = (max*(max+1)/2)-sum;
	System.out.println("missing number is "+missingNum);
	

	}

}
