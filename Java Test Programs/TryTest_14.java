import java.io.*;

class Whatever
{
	private Whatever()  //even declaring this as private Whatever(int i) but invoking as new Whatever()  won't work as in that case the default constructor will get obscured.
	{
		System.out.println("Fuck off");
	}

}

class TryTest_14
{
	public static void main(String args[])
	{

		Whatever o=new Whatever();

	}

}

