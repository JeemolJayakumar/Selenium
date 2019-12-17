package testpackage;

public class Car {
	public void fullThrottle()
	{
		System.out.println("\"The car is going as fast as it can!\"");
	}
	
	public void speed()
	{
		System.out.println("Maximum speed of the car is: 200KM");
	}
	
  public static void main(String[] args)
    {
	Car myCar = new Car();
	myCar.fullThrottle();
	myCar.speed();
    }

}
