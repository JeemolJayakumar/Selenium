package interfaceExample;

public class Shape1 implements Shape {

	public void draw() {
		System.out.println("Drawn shape is Rectangle");
		System.out.println(a);	
	}
	public static void main(String args[])
	{
		Shape1 obj=new Shape1();
		obj.draw();		
	}
}
