 import java.io.*;

 class Test5

 {

	 void func(int ...v)
	 {
		 for(int x: v)
		 System.out.println(x);

	 }

	 public static void main(String args[])
	 {
		 Test5 o=new Test5();

		 o.func();

	 }

 }


