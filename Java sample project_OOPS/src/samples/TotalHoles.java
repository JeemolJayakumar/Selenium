package samples;

import java.util.ArrayList;

public class TotalHoles {
	
	public static void main (String args[])
	
	{
	int temp = 748;
	int holes=0;
	int sum=0;
	
	int[] list1= {1,2,3,5,7};
	int[] list2= {0,4,6,9};
	int[] list3= {8};
	
	ArrayList<Integer> array = new ArrayList<Integer>();
	do{
		
	    array.add(temp % 10);
	    temp /= 10;
	} while  (temp > 0);
	
	for(int i=0;i<array.size();i++) 
	{
	
	if(list1.equals(array.get(i)))
	{
		holes=0;
		sum=sum+holes;
		
	}else if(list2.equals(array.get(i)))
	{
		holes=1;
		sum=sum+holes;
	}else {
		holes=2;
		sum=sum+holes;
	}
}

System.out.println(sum);
		
	}

}
