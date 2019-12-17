package samples;

import java.io.IOException;
import java.util.Scanner;

public class SwapNumbers {
	
	public static void main(String args[]) throws IOException
	{
	//int x=10;
	//int y=15;
	System.out.println("Before Swapped");
	System.out.println("====================");
	//BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	Scanner reader=new Scanner(System.in);
	System.out.println("Enter the value of X");
	int x=reader.nextInt();
	System.out.println("Enter the value of Y");
	int y=reader.nextInt();	
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("====================");
	System.out.println("After Swapped");
	System.out.println("====================");
	System.out.println("x= "+x);
	System.out.println("y= "+y);
	
	}
}
