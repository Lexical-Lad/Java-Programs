import java.io.*;

class Test8
{
	int a;

	Test8(int a)
	{
		System.out.println("Inside the parameterized constructor of the parent class");
	}

	Test8()
	{
		System.out.println("Inside the parameterless constructor of the parent class");
	}
}

class Test8e extends Test8

{
	Test8e(int a)
	{
		System.out.println("Inside the parameterized constructor of the child class");

	}

	Test8e()
	{
		System.out.println("Inside the parameterless constructor of the child class");
	}

}

class TryTest_8
{
	public static void main(String args[])throws IOException

	{
		Test8e o=new Test8e();
		new Test8e(1);
	}
}


