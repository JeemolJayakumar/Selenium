package abstractionExample;

public class Shape1 extends Shape{

	public void draw() {	
		System.out.println("All shapes are drawn successfully");	
	}
	public void circle()
	{
		System.out.println("The shape is Circle");
	}
	
	public static void main(String args[])
	{
		Shape obj=new Shape1();
		obj.draw();
		obj.rectangle();
	}
}
