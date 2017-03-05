import java.io.*;

class Test7
{
	int a=10,b=20;

	void display()
	{
		System.out.println("Inside Test7's display method");
	}

}

class Test7e extends Test7
{
	int c=30;

	void display()
	{
		System.out.println("Inside Test7e's display method");
	}

	void display2()
	{
		System.out.println("Inside Test7e's display2 method");
	}

}

class TryTest_7
{

	public static void main(String args[])throws IOException

	{
		Test7 parent=new Test7();

		Test7e child=new Test7e();

		parent.display();

		parent=child;

		parent.display();	//parent's display method is overriden and that of the class is invoked(dynamic method dispatch)

		//parent.display2(); gives compile-time error

		int val= ((Test7e)parent).c;    //int val= parent.c; gives compile-time error

		System.out.println(val);
	}

}


