import java.io.*;

class ExceptionTest4

{
	static void f()
		{
			try
			{
			int a=0;
			int b=10;
			System.out.println("In method f");
			g();
			//h();
			}

			catch(ArithmeticException e)
				{
					System.out.println("Divided By Zero, madafucka!!!");
				}

				finally
				{
					System.out.println("Finally!!!");
				}
		}




	static void g()
	{
		System.out.println("In method g");
	}

	static void h()
	{
		System.out.println("In method h");
		System.exit(0);
	}




	public static void main(String args[])

	{
		f();
	}
}

