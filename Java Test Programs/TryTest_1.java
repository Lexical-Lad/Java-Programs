import java.io.*;

class Test_1

{
	private int j,k;

	public void assign()
	{
		this.j=10;
		this.k=20;
	}


	private void display1()
	{
		System.out.println(" j = " +j);
		System.out.println(" k = " +k);
	}

	public void display2()
	{

		System.out.println(" j = " +j);
		System.out.println(" k = " +k);
	}

}


class TryTest_1
{
	public static void main(String args[])

	{
		Test_1 o=new Test_1();

		o.assign();
		o.display1();
		o.display2();

	}

}
