import java.io.*;

class ExceptionTest2

{

	public static void main(String args[])throws IOException

	{
		try
		{
			int a=0;

			int tb=10/a;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Fuck the System");
		}
		/*catch(ArithmeticException e)
		{
			System.out.println("Division  by Zero, madafucka!!!");
		}*/
		finally
		{
			System.out.println("Finally!!!");
		}

		System.out.println("_|_");

	}

}

