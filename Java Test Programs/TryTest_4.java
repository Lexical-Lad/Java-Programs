import java.io.*;

class Test_4

{
	int a,b;

	Test_4(Test_4 c) //Making any constructor overrides the implicit(default) constructor, thus making it necessary to explicitly define a constructor with no arguments, if need be.
	{
		c.a=0;
		c.b=0;
	}

}

class TryTest_4
{
	public static void main(String args[])throws IOException

	{
		Test_4 o=new Test_4();

	}

}


