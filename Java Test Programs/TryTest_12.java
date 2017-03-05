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

}



class TryTest_6
{
	public static void main(String args[])
	{
		C o=new C();
		o.ob.f();  //error - just like a private member can't be accessed in a test class even by using the object of the respective class
					//obviously C.B i=o.new B(); won't work either
	}
}
