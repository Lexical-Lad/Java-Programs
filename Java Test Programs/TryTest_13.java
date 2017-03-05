import java.io.*;

interface Callback
{
	void callback(int param);

}

class TryTest_13 implements Callback

{
	public void callback(int p)
	{
		System.out.println("Whatever");
	}

	public static void main(String args[])
	{
		TryTest_13 o=new TryTest_13();

		o.callback(10);

	}

}
