package samples;

public class MethodOverloading {
	
	public static void main (String args[])
	{
		MethodOverloading add=new MethodOverloading();
		add.Add(10,20);
		add.Add(10,20,30);
		add.Add(10,11.25,30);
	}
	
	public void Add(int a, int b)
	{
		int c= a+b;
		System.out.println("Sum is:"+" " +c);
	}
	
	public void Add(int a, double e, int c)
	{
		double d= a+e+c;
		System.out.println("Sum is:"+" "+d);
	}
	
	public void Add(int a, float b, int c)
	{
		float d= a+b+c;
		System.out.println("Sum is:"+" "+d);
	}

}
