package samples;

import java.util.ArrayList;
import java.util.Scanner;

public class TotalNumberHoles {
	
	public static void main (String args[])
	
		{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the number :");
		int temp = reader.nextInt();
		int holes=0;
		int sum=0;
		ArrayList<Integer> array = new ArrayList<Integer>();
		do{
		    array.add(temp % 10);
		    temp /= 10;
		} while  (temp > 0);
		
		//System.out.println(array);
		
		for(int i=0;i<array.size();i++)
		{
			if(array.get(i)==2 || array.get(i)==1 || array.get(i)==3 || array.get(i)==5 || array.get(i)==7 )
			{
				holes=0;
				sum=sum+holes;
				
			}else if(array.get(i)==4 || array.get(i)==0 || array.get(i)==6|| array.get(i)==9)
			{
				holes=1;
				sum=sum+holes;
			}else {
				holes=2;
				sum=sum+holes;
			}
		}
		
		System.out.println("Total holes in the given number is :" +sum);
	}

}
