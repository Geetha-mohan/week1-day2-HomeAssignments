package week1.day2.HomeAssignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {3,2,11,4,6,7};
		int[] array2 = {1,2,8,4,9,7};

		//method1 using traditional for loop
		for(int i=0;i<=array1.length-1;i++)
		{
			for(int j=0;j<=array2.length-1;j++) {
				if(array1[i]==array2[j]) {
					System.out.println(array1[i]);
					break;
				}
			}
		}
		
				
		//Method2 using enhanced for loop
		List<Integer> intersect = new ArrayList<Integer>();
		
		for(int a1: array1)
		{
			for (int a2:array2)
			{
				if(a1==a2) {
					intersect.add(a1);
					break;}
			}
		}
		System.out.println("intersect elements: "+intersect);
		
		
		

	}

}
