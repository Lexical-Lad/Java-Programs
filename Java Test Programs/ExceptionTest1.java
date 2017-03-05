import java.io.*;

class ExceptionTest1
{
	static void throwOne()throws IllegalAccessException
	{
		System.out.println("Inside ThrowOne");

		throw new IllegalAccessException("demo");
	}
	public static void main(String args[])throws IllegalAccessException //without this, a compilation erro is elicited
	{
		try{

			throwOne();
			}
			catch(ArithmeticException e)
			{
				System.out.println("Redundancy is a bitch!!!");
			}
			/*catch(IllegalAccessException e)
			{
				System.out.println("Fuck off");
			}*/
	}
}


