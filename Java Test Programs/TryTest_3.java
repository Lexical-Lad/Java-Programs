import java.io.*;

class Test_3

{
	int a,b;

	Test_3()
	{
		a=10;
		b=20;
		System.out.println("Super ");
	}

}

class Sub extends Test_3
{
	Sub()
	{
		a=30;
		b=40;
		System.out.println("Sub");
	}


}



class TryTest_3
{
	public static void main(String args[])

	{
		Sub o=new Sub();

		System.out.println(" a =" +o.a);
		System.out.println(" b =" +o.b);


	}

}
//to understand, one can say, when object of a subclass is created and control enters (one of) it's constructors, it checks the first line- if it has a super(___) statement, it executes it and goes to the respective constructor of super class.
// BUT IF THERE IS NO super(____) in the first line, an implicit super(); is executed(hence invoking the parameterless constructor of the parent class before proceeding.


// using super(); here is redundant. A constructor of the parent class WILL be executed first. If it was overloaded, we could've used super(___) to choose which one to execute before the child class constructor but in no case can child class constructors be executed before suer class constructors
