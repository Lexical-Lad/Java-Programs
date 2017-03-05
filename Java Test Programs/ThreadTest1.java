import java.io.*;

class Callme
{
	synchronized void call(String msg)
	{
		System.out.println("[" + msg +"\t" + Thread.currentThread());

		/*try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Interrupted");
			}*/

		System.out.println("]"+"\t" +Thread.currentThread());

	}

}

class Caller implements Runnable
{

	String msg;
	Callme target;
	Thread t;

	 public Caller(Callme targ,String s)
	{
		target = targ;
		msg=s;
		t=new Thread(this);

		//t.setPriority(10);

		t.start();
	}

	public void run()
	{
		target.call(msg);
	}
}

class ThreadTest1
{
	public static void main(String args[])throws IOException
	{
		Callme target=new Callme();

		Caller ob1=new Caller(target,"Hello");
		Caller ob2=new Caller(target,"Synchronized");
		Caller ob3=new Caller(target,"World");

		try
		{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}

	}

}
