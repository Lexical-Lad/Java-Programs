import java.io.*;

class TestClass
{
	int i=0;
	String b="Whatever";

	public String toString()  /* removing public modifier gives an error "C:\Users\Samuel\Documents\ToStringTest.java:20: error: toString() in TestClass2 cannot override toString() in Object
	 								String toString()
	       									 ^
  									attempting to assign weaker access privileges; was public
									1 error

									This is because the toString method we are trying to override is defined the 'Object' class with puiblic modifier */
	{
		return "FUCK YOU!";
	}

}


class ControlClass
{
	int i=0;
	String b="Whatever";

}



class ToStringTest
{
	public static void main(String args[])throws IOException

	{

		TestClass t=new TestClass();

		System.out.println(t);

		ControlClass c=new ControlClass();
		System.out.println(c);


	}

}