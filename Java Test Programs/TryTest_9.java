import java.io.*;

class A
{
	static void show1()
	{
		System.out.println("In A - show1");
	}
	 void show2()
		{
			System.out.println("In A - show2");
	}
	void show()
	{
		System.out.println("In A- show");
	}
}

class B extends A
{
	static void show1()
	{
		System.out.println("In B- show1");
	}
	 void show2()
	{
		System.out.println("In B- show2");
	}
	void show3()
	{
		System.out.println("In B- show3");
	}



}

class TryTest_9
{
	public static void main(String args[])

	{
		B ob;
		A oa;
				 A ref=new A();   ref.show1();
		ob=new B();

		oa=ob;

		                    // oa.show3();- ERROR!!!
		oa.show2();

		oa.show();


		oa.show1();

		ob=(B)oa;
		ob.show2();
		oa.show2();

}
}
