import java.io.*;

class Petrol_Pump

{
	static int fuel_left_1,fuel_left_2;
	static boolean working1,working2;

	Petrol_Pump(int a1, int a2)
	{
		fuel_left_1=a1;
		fuel_left_2=a2;
		working1=working2=false;
	}


	synchronized void pump_fuel()
	{
		if((Thread.currentThread().getName()).equals("1"))
		{

			while(working2)
			{
				try
				{
					wait();
				}
				catch(InterruptedException e)
				{
					System.out.println("Interrupted");
				}

			}

			if(fuel_left_1>0)
				{
					fuel_left_1--;
					System.out.println("Fuel Left in station 1 =" +fuel_left_1);
				}
			else
				working1=false;

			notifyAll();
		}

		else
		{

						while(working1)
						{
							try
							{
								wait();
							}
							catch(InterruptedException e)
							{
								System.out.println("Interrupted");
							}

						}

						if(fuel_left_2>0)
							{
								fuel_left_2--;
								System.out.println("Fuel Left in station 2 =" + fuel_left_2);
							}
						else
							working2=false;

						notifyAll();
		}

	}

}

class Pump1 implements Runnable
{
	Petrol_Pump p;

	Pump1(Petrol_Pump p)
	{
		this.p=p;

		new Thread(this,"1").start();
	}

	public void run()

	{
		while(Petrol_Pump.fuel_left_1>0)
			p.pump_fuel();

	}

}


class Pump2 implements Runnable
{
	Petrol_Pump p;

	Pump2(Petrol_Pump p)
	{
		this.p=p;

		new Thread(this,"2").start();
	}

	public void run()

	{
		while(Petrol_Pump.fuel_left_2>0)
			p.pump_fuel();

	}

}


class Test_Petrol_Pump

{
	public static void main(String args[])
	{
		Petrol_Pump p=new Petrol_Pump(20,30);

		Pump1 p1=new Pump1(p);
		Pump2 p2=new Pump2(p);
	}

}



