import java.io.*;

class CheckArgument extends Exception
{
	private int val;

	CheckArgument(int a)
	{
		val=a;
	}

	public String toString()
	{
		return "Exception: Number of command line arguments passed is :" +val + "   which does not meet the stipulated minimum of 5. SCREW YOU!!";
	}

}


class UserDefinedExceptionTest
{
	public static void main(String args[])throws CheckArgument

	{
		try
		{
			if(args.length<5)
			throw new CheckArgument(args.length);
		}
		catch(CheckArgument e)
		{
			System.out.println(e);
		}

		int sum=0;
		for(int i=0;i<args.length;i++)
		sum+=Integer.parseInt(args[i]);

		System.out.println("Sum : "+sum);
	}

}

