import java.io.*;

class Thr extends Thread
{

	public void  run()
	{
		for(int i=0;i<5;i++)
			System.out.println("Inside Thread "+i);

	}
}

class TryThread2
{
	public static void main(String args[])throws IOException

	{
		Thr obj1=new Thr();
		Thr obj2=new Thr();
		Thr obj3=new Thr();

		obj1.start();

		obj2.start();
		obj3.start();

	}
}

