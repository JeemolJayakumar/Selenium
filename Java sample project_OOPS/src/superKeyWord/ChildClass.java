package superKeyWord;

public class ChildClass extends ParentClass {
	String color="Green";
	
	void printClor() {
	System.out.println(color);
	System.out.println(super.color);
	}
	
	public static void main(String args[])
	{
		ChildClass pc=new ChildClass();
		pc.printClor();
	}
}
