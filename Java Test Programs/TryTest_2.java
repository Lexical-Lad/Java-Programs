import java.io.*;

class Test_2

{
	private int j=10,k=20;

	public void display()
	{

		System.out.println(" j = " +j);
		System.out.println(" k = " +k);
	}

}

class Temp extends Test_2
{

}



class TryTest_2
{
	public static void main(String args[])

	{
		Temp o=new Temp();
		o.display();
	}

}
