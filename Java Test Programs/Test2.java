import java.io.*;

class Temp

{

	private int x=20;

	void display()
	{
		System.out.println(x);
	}


}

class Test2 extends Temp
{

	public static void main(String args[])throws IOException

	{

		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		Test2 o=new Test2();
		o.display();



	 }

}
