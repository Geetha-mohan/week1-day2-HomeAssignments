package week1.day2.HomeAssignments;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
		//method1 using StringBuilder to use reverse function
		String input = "121";
		String output;
		StringBuilder strBuilder = new StringBuilder(input);
		output = strBuilder.reverse().toString();
		
		if (input.equals(output))
			System.out.println(input+" is a palindrome");
		else
			System.out.println(input+" is not a palindrome"); 
		
		
		
		//method2 using traditional for loop
		  int reminder,sum=0,temp;    
		  int inputNumber=1234;  
		  temp=inputNumber;    
		  while(inputNumber>0)
		  {    
		   reminder=inputNumber%10;  //getting remainder  
		   sum=(sum*10)+reminder;    
		   inputNumber=inputNumber/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number "+temp);    
		  else    
		   System.out.println("not palindrome " +temp);    
		
	}

}
