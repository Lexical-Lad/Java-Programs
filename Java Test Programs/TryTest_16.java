import java.io.*;

class Test_16

{
	int a,b;

	void f()
	{
		System.out.println("Parent");
	}

}

class Test_16child extends Test_16
{
	void f()
	{
		System.out.println("Child");

	}
}


class TryTest_16
{
	public static void main(String args[])throws IOException

	{

		Test_16child o=new Test_16child();

		Test_16 l=o;

		o.f();

		l.f();

		((Test_16)o).f();


	}
}
