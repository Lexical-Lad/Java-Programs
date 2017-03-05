import java.io.*;

class C
{
	B ob=new B();

	private class B
	{
		int  a=10,b=20;
		B()
		{
			a=10;
			b=20;
		}

		void f()
		{
			System.out.println(ob.a+ob.b);
		}

	}

		void func()
	{

		System.out.println(ob.a+ob.b);

	}

	//public static void main(String args[])
	//{
	// 	C o=new C();
	 //	o.func();
	//}
}



class TryTest_6
{
	public static void main(String args[])
	{
		C o=new C();
		o.func();
	}
}
