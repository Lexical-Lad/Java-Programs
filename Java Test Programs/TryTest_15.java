import java.io.*;

class Nigger

{
	void a()
	{
		System.out.println("Inside 'a'");
		return;
		//System.out.println("Eat my shorts"); -unreachable statement, hence compilation error

	}

	int b()
	{
		System.out.println("Inside 'b'");
		return 0; // a method with return type 'int' must return a value(int); compilation error otherwise
					//if a method not of type 'void' has just a return statement(no value succeeding it, eg. 'return;) then it will trigger a compilation error
	}

}

class TryTest_15

{
	public static void main(String args[])throws IOException

	{
		Nigger o=new Nigger();

		o.a();
		o.b(); // int value returned but not stored
	}
}
