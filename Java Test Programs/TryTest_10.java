import java.io.*;

class Test_10

{

		inner1 i11=new inner1();

		int a=20;

		class inner1
		{
			 int x;
			 int a=10;

			 void display()
			 {
				 System.out.println(" a = " + a);
				 System.out.println(" a = " + this.a);
				 System.out.println(" a = " + Test_10.this.a);
				 System.out.println("Inside display method of inner1 class");
			 }

		 }

		 private class inner2
		 {
			 int y;
			 int a=15;

			 void display()
			 {
				 System.out.println(" a = " + a);
				 System.out.println("Inside display method of the inner2 class");
			 }

		 }
		  static class inner3
		 		 {
		 			 int y;
		 			 int a=30;

		 			 void display()
		 			 {
		 				 System.out.println(" a = " + a);
		 				 System.out.println("Inside display method of the inner3 class");
		 			 }

		 		 }

		void displayOuter()
		{
			/*inner4 i4=new inner4();
			i4.dp();
				ERROR!!! - as inner4 doesn't exist yet*/


			class inner4
			{
				void dp()
				{
					System.out.println("Fuck off");
				}
			}
			inner4 i4=new inner4();
			i4.dp();

		}


 }

 class TryTest_10

 {
	 public static void main(String args[])throws IOException

	 {

		 	Test_10 o =new Test_10();
			Test_10.inner1 i1= o.new inner1();//new o.inner() gives error
			i1.display();

			//Test_10.inner2 i2=o.new inner2();-ERROR!!!
			o.i11.display();

			o.displayOuter();


		}
	}


