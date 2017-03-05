import java.io.*;

class A
{
	private class B
	{
		int  a=10,b=20;
		B()
		{
			a=10;
			b=20;
		}

	}

		void func()
	{
		B ob=new B();
		System.out.println(ob.a+ob.b);

	}

}

class TryTest_5
{
	public static void main(String args[])
	{
		A o=new A();
		o.func();
	}

}

