package samples;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) 
	{
				Scanner reader=new Scanner(System.in);
				System.out.println("Enter the number to reverse");
		        int num = reader.nextInt(); 
		        int reversed = 0;
		        while(num != 0) {
		            int digit = num % 10;
		            reversed = reversed * 10 + digit;
		            num = num/10;
		        }
		        System.out.println("Reversed Number: " + reversed);
	}
		

}


