import java.io.*;

class ExceptionTest6 //checking multiple exceptions

{
	public static void main(String args[])
	{
		try
		{
			int a=1;
			int b[]={0};

	 		//a=a/0;
	 		b[2]=1;


		}
		catch(ArrayIndexOutOfBoundsException|ArithmeticException e)
		{
			System.out.println("Exception Caught  "+ e);
		}

	}

}
