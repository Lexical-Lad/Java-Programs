import java.io.*;

class ThreadTest1_1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i+=2)
		{
			System.out.println(i);

			try
			{
				sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Thread 1 interrupted");
			}

		}

	}

}

class ThreadTest1_2 extends Thread

{
	public void run()
	{
		for(int i=1;i<10;i+=2)
		{
			System.out.println(i);

			try
				{
					sleep(1000);
				}
				catch(InterruptedException e)
				{
					System.out.println("Thread 2 interrupted");
				}

		}
	}

}

class ThreadTest1_3 extends Thread

{
	public void run()
	{
		for(int i=1;i<10;i+=2)
		{
			System.out.println("X");

			try
				{
					sleep(1000);
				}
				catch(InterruptedException e)
				{
					System.out.println("Thread 2 interrupted");
				}

		}
	}

}

class TryThreadTest1
{
	public static void main(String args[])throws IOException
	{

		ThreadTest1_1 c1=new ThreadTest1_1();
		ThreadTest1_2 c2=new ThreadTest1_2();
		ThreadTest1_3 c3=new ThreadTest1_3();

		Thread t1=new Thread(c1);
		Thread t2=new Thread(c2);
		Thread t3=new Thread(c3);

		t1.start();

		t2.start();
	}

}




