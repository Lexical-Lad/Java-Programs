import java.io.*;


class ReaderThread extends Thread
{
	ReaderThread()
	{
		start();
	}

	public void run()
	{
		try
		{
			BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

			String s=xx.readLine();

			System.out.println("String accepted!");
			System.out.println("The String entered is  : " + s);
		}

		catch(IOException e)
		{
			System.out.println("IOException occurred!");
			e.printStackTrace();

		}

	}

}

class PrinterThread extends Thread
{

	PrinterThread()
	{
		start();
	}

	public void run()
	{
		try
		{
			while(true)
			{
				Thread.sleep(1000);
				System.out.println("\nWhatever");
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted!");
			e.printStackTrace();
		}

	}


}

class ThreadTest2
{

	public static void main(String args[])throws IOException
	{
		new PrinterThread();
		new ReaderThread();


	}

}
