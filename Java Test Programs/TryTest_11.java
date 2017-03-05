import java.io.*;

interface TestInterface11
{
	void display();
}


class Test_11 implements TestInterface11

{
	public void display()
	{
		System.out.println("Inside display method of Test_11 class");

	}

}

class TryTest_11

{
	public static void main(String args[])throws IOException

	{
		Test_11 o=new Test_11();

		o.display();

	}

}



