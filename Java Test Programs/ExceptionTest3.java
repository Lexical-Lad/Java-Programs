import java.io.*;

class ExceptionTest3

{

	public static void main(String args[])throws IOException

	{
		ArithmeticException o=new ArithmeticException();//Just ArithemticException a; doesn't work either
		try
		{
			int a=0;

			int tb=10/a;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Fuck the System");
		}
		catch(o)// catch(ArithmeticException) doesn't work either
		{
			System.out.println("Division  by Zero, madafucka!!!");
		}
		finally
		{
			System.out.println("Finally!!!");
		}

			System.out.println("_|_");

	}

}

