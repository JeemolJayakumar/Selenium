package superKeyWord;

public class Child extends Parent{
	
	void eat()
	{
		System.out.println("Cat is eating");
		super.eat();
	}
	public static void main (String args[])
	{
		Child obj=new Child();
		obj.eat();
	}
}
